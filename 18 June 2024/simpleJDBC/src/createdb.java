import java.sql.DriverManager;
import java.sql.Connection;
//load the driver manager
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class createdb {
   static  String url = "jdbc:mysql://localhost:3306/newdb";
        static String user = "root";
        static String password ="";
        

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(url,user,password);
         Statement st = conn.createStatement();
      ) {		      
          String sql = "CREATE TABLE studentstable " +
                   "(id INTEGER, " +
                  " name varchar(255))" ;

         st.executeUpdate(sql);
         System.out.println("Created table in given database...");   	  
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}