package crud;

import java.sql.*;

public class Crud {
    private static final String URL = "jdbc:mysql://localhost:3306/nstidb";
    private static final String USER = "root";
    private static final String PASSWORD = "nsti";

    public static void main(String[] args) {
        // Call createUser method to create a new intern data
        //createUser(103, "Anu CA", "anu@gmail.com");
        //readUser();
        //  createUser(104, "Cicili J", "cicili@gmail.com");
        //readUser();
        //updateUser(101,"lisy@gmail.com");
        readUser();
        deleteUser(103);
        readUser();
    }

    // Define createUser method outside main method
    public static void createUser(int id, String name, String email) {
        String query = "INSERT INTO interndetails(id, name, email) VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, email);

            int rowsInserted = ps.executeUpdate();
            System.out.println("Rows inserted: " + rowsInserted);

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    //read user
    public static void readUser(){
        String query = "select * from interndetails";
        try(Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(query)){
            System.out.println("Intern Details :");
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                System.out.println("ID :"+ id + " Name :"+name+" Email: "+email);
            }
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public static void updateUser(int id, String newemail){
        String query = "update interndetails set email=? where id=? ";
        try(Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
                PreparedStatement ps = conn.prepareStatement(query)){
            ps.setString(1, newemail);
            ps.setInt(2, id);
            int rowsupdated = ps.executeUpdate();
            System.out.println("Rows updated "+ rowsupdated);
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
    public static void deleteUser(int id){
        String query = "delete from interndetails where id=?";
        try(Connection conn= DriverManager.getConnection(URL,USER,PASSWORD);
                PreparedStatement ps = conn.prepareStatement(query)){
            ps.setInt(1,id);
            int rowsDeleted = ps.executeUpdate();
            System.out.println("Rows deleted :"+rowsDeleted);
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
}
