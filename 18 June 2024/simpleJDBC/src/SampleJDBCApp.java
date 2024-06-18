import java.sql.DriverManager;
import java.sql.Connection;
//load the driver 
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class SampleJDBCApp {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root";
        String password ="";
        
        try(Connection conn = DriverManager.getConnection
        (url,user,password);Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("SELECT * from students")){
           while(rs.next()){
               String id = rs.getString("id_no");
               String name = rs.getString("name");
               System.out.println("ID :"+id+ ", Student Name :"+name);
           }
        }
        catch(SQLException e){
            System.out.println(e);
            
        }
        
    }
}
