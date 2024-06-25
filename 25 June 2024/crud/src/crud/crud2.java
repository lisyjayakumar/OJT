
package crud;
import java.sql.*;

/**
 *
 * @author ADIT
 */
public class crud2 {
    
    private static final String URL = "jdbc:mysql://localhost:3306/nstidb";
    private static final String USER = "root";
    private static final String PASSWORD = "nsti";
    //create
    public static void createUser(int id, String name, String place){
        
       String query = "insert into aditstudents(id,name,place)values(?,?,?)";
       try(Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
               PreparedStatement ps = conn.prepareStatement(query)){
           ps.setInt(1,id);
           ps.setString(2,name);
           ps.setString(3,place);
           int rowsInserted = ps.executeUpdate();
           System.out.println("Rows inserted :"+rowsInserted);
       }
       catch(SQLException e){
           System.out.println(e);
       }
    }
    
    //read
    public static void readUsers(){
        String query = "select * from aditstudents";
        try(Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(query)){
            
           System.out.println("Student details");
           while(rs.next()){
               int id = rs.getInt("id");
               String name = rs.getString("name");
               String place = rs.getString("place");
               System.out.println("ID :"+id+ " Name :"+name+" Place :"+place);
               
           }
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
    public static void updateUser(int id, String newplace){
        String query = "update aditstudents set place =? where id=?";
        try(Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
                PreparedStatement ps = conn.prepareStatement(query)){
            ps.setString(1,newplace);
            ps.setInt(2, id);
            int rowUpdated = ps.executeUpdate();
            System.out.println("Row updated :"+rowUpdated);
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public static void DeleteUser(int id){
        String query = "delete  from aditstudents where id =?";
        try(Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
                PreparedStatement ps = conn.prepareStatement(query)){
            ps.setInt(1,id);
            int deleterows = ps.executeUpdate();
            System.out.println("Rows deleted :"+deleterows);
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args){
        
        createUser(1,"Lisy","tnkl");
        readUsers();
        updateUser(1,"attingal");
        readUsers();
        DeleteUser(1);
        readUsers();
    }
    
}
