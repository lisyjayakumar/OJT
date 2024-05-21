import java.time.LocalDate; //class represents a date without a time-zone
import java.time.Period;//class represents a quantity of time in terms of years, months, and days.
import java.util.Scanner;
public class Employee {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter employee name :");
        String name = sc.nextLine();
        System.out.println("Enter joining Date"); //2003-05-25
        LocalDate joiningDate = LocalDate.parse(sc.nextLine());
        

        // Create a LocalDate object for the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the age in years, months, and days
        Period experience = Period.between(joiningDate, currentDate);

        // Print the age
        System.out.println("Name : "+name );
        System.out.println("Expeience : " + experience.getYears() +"Years");
    }
}