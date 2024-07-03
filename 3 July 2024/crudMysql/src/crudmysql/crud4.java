/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudmysql;



import java.sql.*;
public class crud4 {
    private static final String URL="jdbc:mysql://localhost:3306/librarydb";
    private static final String USER="root";
    private static final String PASSWORD="nsti";
    
    public static void main(String[] args){
       
        //insertTable("The Yellow Meads of Asphodel","H. E. Bates",2);
        //insertTable("The Wives of Bath","Susan Swan",3);
         //insertTable("Wildfire at Midnight","Mary Stewart",3);
        
         updateTable(4, 1);
         deleteTable(4);
          
    
    }
    public static void createDatabase(Connection conn,String dbname) throws SQLException{
        String createdb ="CREATE DATABASE IF NOT EXISTS " + dbname;
        Statement st = conn.createStatement();
        st.executeUpdate(createdb);
         System.out.println("Database Created Successfully"); 
        
    }
    public static void createTable(Connection conn,String Tbname) throws SQLException{
        String createtb = "CREATE TABLE IF NOT EXISTS "+ Tbname + "("+
                "book_id INT AUTO_INCREMENT PRIMARY KEY, "+
                "title VARCHAR(100), "+
                "author VARCHAR(100), "+
                "quantity INT)";
        Statement st = conn.createStatement();
        st.executeUpdate(createtb);
        System.out.println("Table created Successfully");
    }
   public static void insertTable(String name,String author,int quantity){
        String createQuery="insert into Books(title,author,quantity) values (?,?,?) ";
        try(Connection con = DriverManager.getConnection(URL,USER,PASSWORD);
               PreparedStatement ps=con.prepareStatement(createQuery)){
            ps.setString(1, name);
            ps.setString(2, author);
            ps.setInt(3, quantity);
           int insert= ps.executeUpdate();
            System.out.println("rows inserted "+insert);
            
        }
        catch(SQLException e){
            e.printStackTrace();
        }
                
    }
    public static void readTable(){
        String readQuery="select * from Books";
        try(Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(readQuery)){
            System.out.println("Books table details");
            while(rs.next()){
                int id=rs.getInt("book_id");
                String name=rs.getString("title");
                String author=rs.getString("author");
                int quantity=rs.getInt("quantity");
                System.out.println("Book ID :"+id+"Title :" +name+"Author :"+author+"Quantity :"+quantity);
                
            }
        }
        catch(SQLException e){
           System.out.println(e);
        }
    }
      public static void updateTable(int id,int quantity){
        String update="update Books set quantity=? where book_id=? ";
        try(Connection con = DriverManager.getConnection(URL,USER,PASSWORD);
               PreparedStatement ps=con.prepareStatement(update)){
            ps.setInt(1, quantity);
            ps.setInt(2, id);
            
           int insert= ps.executeUpdate();
            System.out.println("rows updated "+insert);
            
        }
        catch(SQLException e){
            e.printStackTrace();
        }
                
    }
      public static void deleteTable(int id){
        String update="delete from Books where book_id=? ";
        try(Connection con = DriverManager.getConnection(URL,USER,PASSWORD);
               PreparedStatement ps=con.prepareStatement(update)){
          
            ps.setInt(1, id);
            
           int rows = ps.executeUpdate();
            System.out.println("rows deleted "+rows);
            
        }
        catch(SQLException e){
            e.printStackTrace();
        }
                
    }
    
    
}
