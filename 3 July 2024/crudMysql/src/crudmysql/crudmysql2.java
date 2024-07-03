/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudmysql;
import java.sql.*;

public class crudmysql2 {
 
    private static final String URL = "jdbc:mysql://localhost:3306/";
   private static final String USER = "root";
   private static final String PASSWORD = "nsti";
    public static void main(String[] args){
        String dbname ="InventoryDB";
        String tbname="Products";
         try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             createDB(conn, dbname);
            conn.setCatalog(dbname);
            createTable(conn, tbname);
            
            conn.close(); // Close the connection when done
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void createDB(Connection conn, String dbname) throws SQLException {
        //String dbcreatequery = "CREATE DATABASE IF NOT EXISTS " + dbname;
        String dbcreatequery = "CREATE DATABASE IF NOT EXISTS " + dbname;
         Statement st = conn.createStatement();
        st.executeUpdate(dbcreatequery);
        System.out.println("Database Created Successfully");
       // Close statement
    }
    public static void createTable(Connection conn, String tableName)throws SQLException{
        String tbquery ="CREATE TABLE IF NOT EXISTS " + tableName + "(" +
                "production_id INT AUTO_INCREMENT PRIMARY KEY, " +
                "product_name VARCHAR(100), " +
                "price DOUBLE, " +
                "stock_quantity INT)";

        Statement st = conn.createStatement();
        st.executeUpdate(tbquery);
        System.out.println("Table created successfully");
                
    }
    
    
}
