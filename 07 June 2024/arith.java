import java.util.Scanner;
// Write a Java program using switch-case that performs basic arithmetic operations (addition, subtraction, multiplication, division) based on user input.  
public class arith {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter operator(add/sub/mul/div)");
        String operator  = scan.nextLine();
         
        System.out.println("Enter first number");
        int x = scan.nextInt();

        System.out.println("Enter Second number");
        int y = scan.nextInt();

     
        switch (operator) {
            case "add" :
            System.out.println("Addition : "+(x+y) );
            break;
            case "sub":
            System.out.println("Subtraction :"+(x-y));
            break;
            case "mul":
            System.out.println("Multiplication : "+(x*y));
            break;
            case "div":
            System.out.println("Division : "+(x/y));
            break;
            default:
                System.out.println("invalid");;
        }
    }
    
}
