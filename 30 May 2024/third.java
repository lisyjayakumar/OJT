
import java.util.Scanner;
public class third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numString =sc.nextLine();
        String[] numberasString=numString.split(",");
        int[] numbers = new int[numberasString.length];
        for (int i = 0; i < numberasString.length; i++) {
            numbers[i] = Integer.parseInt(numberasString[i].trim()); 
        }
        System.out.println("Array of numbers ");
        for (int number : numbers){
            System.out.print(number+",");
        }

        
    }}
    

