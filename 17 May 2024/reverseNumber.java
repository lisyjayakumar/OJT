import java.util.Scanner;
public class reverseNumber {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = s.nextInt();
        int temp = number;
        int reminder;
        int sum=0;

        while(temp>0){
            reminder = temp%10;
            sum= (sum*10)+reminder;
            temp = temp/10;
        }
        System.out.println(sum);

        
    }
}
