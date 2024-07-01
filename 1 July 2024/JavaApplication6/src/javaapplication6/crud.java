
package javaapplication6;
import java.sql.*;
//PreparedStatement execute the sql query with parameter
//ResultSet 

/**
 *
 * @author ADIT
 */
public class crud {
    private static final String url="jdbc:mysql://localhost:3306/employeedata";
    private static final String user = "root";
    private static final String password="nsti";
    
    
    
    public static void main(String[] args){
        try{
            Connection conn =DriverManager.getConnection(url,user,password);
            //create a record
            createRecord(conn,1,"lisy","lisy@gmail.com");
             createRecord(conn,2,"anu","anu@gmail.com");
            //read record
            readRecord(conn);
            //update record
            updateRecord(conn,1,"lisy J","lisyj@gmail.com");
            //delete Record
            deleteRecord(conn,1);
            conn.close();
            
        }
        catch(SQLException e){
            e.printStackTrace();
            
        }
    }
    public static void createRecord(Connection conn,int id,String name,String email)throws SQLException{
        
        String insertQuery = "insert into users(id,name,email)values(?,?,?)";
        PreparedStatement ps=conn.prepareStatement(insertQuery);
        ps.setInt(1,id);
        ps.setString(2,name);
        ps.setString(3,email);
        ps.executeUpdate();
        System.out.println("record created successfully");
        
    }
    public static void readRecord(Connection conn)throws SQLException{
        String selectQuery="select * from users";
        PreparedStatement ps = conn.prepareStatement(selectQuery);
        ResultSet rs =ps.executeQuery();
        while(rs.next()){
            int id= rs.getInt("id");
            String name = rs.getString("name");
            String email=rs.getString("email");
            System.out.println("ID :"+id+" Name :"+name+" Email :"+email);
        }
        
    }
    public static void updateRecord(Connection conn, int id, String name, String email)throws SQLException{
        String updateQuery = "update users set name=?, email=? where id=?";
        PreparedStatement ps = conn.prepareStatement(updateQuery);
        ps.setString(1,name);
        ps.setString(2, email);
        ps.setInt(3, id);
        ps.executeUpdate();
        System.out.println("Record updated Successfully");
    }
    
    public static void deleteRecord(Connection conn, int id)throws SQLException{
        String deleteQuery= "delete from users where id=?";
        PreparedStatement ps = conn.prepareStatement(deleteQuery);
        ps.setInt(1,id);
        ps.executeUpdate();
        System.out.println("Deleted Sucessfully");
        
    }
}
    

