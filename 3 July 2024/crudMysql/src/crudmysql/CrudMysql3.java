/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudmysql;
import java.sql.*;

/**
 *
 * @author ADIT
 */
public class CrudMysql3 {
    private static final String URL="jdbc:mysql://localhost:3306/customerdb";
    private static final String USER ="root";
    private static final String PASSWORD="nsti";
    
    public static void main(String[] args){
        insertTable("neenu","thonnakkal");
        insertTable("meera","Trivandrum");
        insertTable("laya","banglore");
        readTable();
    }
    public static void insertTable(String name,String city){
        String createQuery="insert into customers(customer_name,city) values (?,?) ";
        try(Connection con = DriverManager.getConnection(URL,USER,PASSWORD);
               PreparedStatement ps=con.prepareStatement(createQuery)){
            ps.setString(1, name);
            ps.setString(2, city);
           int insert= ps.executeUpdate();
            System.out.println("rows inserted "+insert);
            
        }
        catch(SQLException e){
            e.printStackTrace();
        }
                
    }
    public static void readTable(){
        String readQuery="select * from customers";
        try(Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(readQuery)){
            System.out.println("customers table details");
            while(rs.next()){
                int id=rs.getInt("customer_id");
                String name=rs.getString("customer_name");
                String city=rs.getString("city");
                System.out.println("ID :"+id+"Customer Name :" +name+"City :"+city);
                
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}
