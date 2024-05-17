import java.util.Scanner;
public class purchase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the quantity: ");
        int quantity = s.nextInt();
        int total = quantity * 100;
        if(total>1000){
            int discount = (total*10)/100;
            System.out.println("Your discount amount is : "+discount+ " And your amount is :"+ (total-discount) );
        }
        else{
            System.out.println("Your amount is :"+total);
        }
    }}

