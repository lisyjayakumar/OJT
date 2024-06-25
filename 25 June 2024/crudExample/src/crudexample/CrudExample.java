package crudexample;
import java.sql.*;
import java.text.*;

public class CrudExample {
    private static final String URL = "jdbc:mysql://localhost:3306/newdatabase";
    private static final String USER = "root";
    private static final String PASSWORD = "nsti";
    
    //create
    
    public static void insertEmployee(int EmployeeID, String FirstName, String LastName , String Email, String HireDate){
        String query = "insert into employees(EmployeeID,FirstName,LastName,Email,HireDate)values(?,?,?,?,?)";
        try(Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
                PreparedStatement ps = conn.prepareStatement(query)){
            ps.setInt(1,EmployeeID);
            ps.setString(2,FirstName);
            ps.setString(3,LastName);
            ps.setString(4,Email);
            ps.setString(5,HireDate);
            
            int insertedrows = ps.executeUpdate();
            System.out.println("Row inserted :"+insertedrows);
            
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
    //read
    
    public static void selectEmployees(){
        String query = "select * from employees";
        try(Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(query)){
            System.out.println("Employees details");
            while(rs.next()){
                int emp_id = rs.getInt("EmployeeID");
                String fname = rs.getString("FirstName");
                String lname = rs.getString("LastName");
                String email = rs.getString("Email");
                String hiredate = rs.getString("HireDate");
                System.out.println("EmployeeID :"+emp_id+" Name :"+fname+" "+lname+" Email :"+email+"HireDate :"+hiredate);
            }
        }
        catch(SQLException e){
            System.out.println(e);
        }
            
    }
    public static void selectEmployeesname(){
        String query = "select FirstName,LastName from employees where YEAR(HireDate) =2023";
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        Date date =dateFormat.parse(hiredate);
        try(Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(query)){
            System.out.println("Employees hired in 2023");
            
            while(rs.next()){
                
                String fname = rs.getString("FirstName");
                String lname = rs.getString("LastName");
                
                System.out.println(fname+" "+lname);
            }
        }
        catch(SQLException e){
            System.out.println(e);
        }
            
    }
    public static void updateEmployees(int emp_id, String newemail){
        String query = "update employees set Email=? where EmployeeID=?";
        try(Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
                PreparedStatement ps = conn.prepareStatement(query)){
            ps.setString(1,newemail);
            ps.setInt(2,emp_id);
            int rowsupdate = ps.executeUpdate();
            System.out.println(rowsupdate);
            
        }
        catch(SQLException e){
            System.out.println(e);
        }
        
    }
    public static void updateEmployees1(String HireDate, String LastName){
        String query = "update employees set HireDate=? where LastName=?";
        try(Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
                PreparedStatement ps = conn.prepareStatement(query)){
            ps.setString(1,HireDate);
            ps.setString(2,LastName);
           
            int rowsupdate = ps.executeUpdate();
            System.out.println("rows updated: "+rowsupdate);
            
        }
        catch(SQLException e){
            System.out.println(e);
        }
        
    }
    
    public static void deleteEmployees(int emp_id){
        String  query = "delete from employees where EmployeeID=?";
        try(Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
                PreparedStatement ps= conn.prepareStatement(query)){
            ps.setInt(1,emp_id);
            int deleterows = ps.executeUpdate();
            System.out.println("deleted Rows :"+deleterows);
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
     public static void HiredBefore(String date) {
        String query = "DELETE FROM employees WHERE HireDate < ?";
        try (
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = conn.prepareStatement(query);
        ) {
            ps.setDate(1, java.sql.Date.valueOf(date));
            int rowsDeleted = ps.executeUpdate();
            System.out.println("Rows deleted: " + rowsDeleted);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
   
    public static void main(String[] args) {
        insertEmployee(1,"John","Doe","john.doe@example.com","2023-02-01");
        insertEmployee(2,"Lisy","Jayakumar","LisyJ@gmail.com","2022-02-01");
        insertEmployee(3,"Anu","ca","anu@gmail.com","2022-02-01");
        System.out.println("*****************");
        selectEmployees();
         System.out.println("*****************");
        selectEmployeesname();
        System.out.println("*****************");
        updateEmployees(1,"john.doe@company.com");
         selectEmployees();
        System.out.println("*****************");
       updateEmployees1("2023-07-01","Doe");
        selectEmployees();
        System.out.println("*****************");
       
        deleteEmployees(1);
         selectEmployees();
       
         System.out.println("*****************");
        HiredBefore("2023-01-01");
        
    
         selectEmployees();
    }
    
}
