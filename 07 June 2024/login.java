//Write a Java program that checks if a user can log in based on a predefined username and password. Use if-else statements to validate the credentials and print appropriate messages.
import java.util.Scanner;
public class login {
    public static void main(String[] args){
        String username = "Lisy Jayakumar";
        String password = "lisy@1234";
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the username : ");
        String uname = scan.nextLine();

        System.out.println("Enter the password : ");
        String pwd = scan.nextLine();

        if(username.equals(uname) && password.equals(pwd)){
            System.out.println("Logged in successfully");
        }
        else{
           
            System.out.println("Username or password is incorrect");
        }

    }
}
