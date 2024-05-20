/*2.Write a Java program that takes three angles of a triangle as input and checks
whether the triangle is valid. A triangle is valid if the sum of its angles is exactly 180
degrees..*/
import java.util.Scanner;

public class triangle {
     public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Ente first side of triangle -x");
        int x = s.nextInt();
        System.out.println("Ente Second side of triangle -y");
        int y = s.nextInt();
        System.out.println("Ente third side of triangle -z");
        int z = s.nextInt();
        int sum = x+y+z;

        if(sum == 180){
            System.out.println("Valid Triangle");
        }
        else{
            System.out.println("Not valid Triangle");
        }
    }
}
