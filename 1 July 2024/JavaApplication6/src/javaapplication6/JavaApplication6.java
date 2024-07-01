
package javaapplication6;
import java.sql.*;

public class JavaApplication6 {
        private static String URL ="jdbc:mysql://localhost:3306/app6";
        private static String USER="root";
       private static String PASSWORD="nsti";
        
    public static void main(String[] args) {
        // TODO code application logic here
        Connection connection=null;
        try{
            connection= DriverManager.getConnection(URL,USER,PASSWORD);
            if(connection!=null){
                System.out.println("Successfully Connected");
                
            }
        }
        catch(SQLException e){
            System.out.println(e);
            System.out.println("Failed to connect tje database");
        }
        finally{
            //close the connection
            try{
                if(connection!=null && !connection.isClosed()){
                    connection.close();
                }
            }
            catch(SQLException e){
                e.printStackTrace();
                
            }
        }
    }
    
}
