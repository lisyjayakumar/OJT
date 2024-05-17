import java.util.Scanner;

public class printgreatest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number :");
        int x = s.nextInt();
        System.out.println("Enter second number :");
        int y = s.nextInt();
        if(x > y){
            System.out.println(x + " is greaterthan "+y);
        }
        else if(x<y){
            System.out.println(y + "is greaterthan "+x);
        }
        else{
            System.out.println("Both are equal");
        }
    
    }}
  
