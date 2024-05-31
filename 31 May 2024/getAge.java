import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;


public class getAge{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your birthdate(yyyy-mm-dd)");
        String birthdate = sc.nextLine();
        LocalDate Dob = LocalDate.parse(birthdate);
        System.out.println("MY birthday  :"+Dob);
        LocalDate today = LocalDate.now();
        System.out.println("Today's date :"+today);
        Period age = Period.between(Dob,today);
      
        System.out.println("My age is :"+age.getYears());
       




    }
}