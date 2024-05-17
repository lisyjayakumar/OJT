import java.util.Scanner;
public class square {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length : ");
        int length = s.nextInt();
        System.out.println("enter the breadth :");
        int breadth = s.nextInt();

        if(length == breadth){
            System.out.println("this is a square");

        }
        else{
            System.out.println("not a square");
        }
    }}
    

