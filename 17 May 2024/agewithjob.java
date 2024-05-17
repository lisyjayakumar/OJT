import java.util.Scanner;
public class agewithjob {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Sex(M/F)");
        String sex = s.nextLine();
        System.out.println("Enter your age ?");
        int age = s.nextInt();
        
        
        if(sex.equals("F") || sex.equals("f")){
            System.out.println("Placed in Urban areas");
        }
        else if(sex.equals("m")|| sex.equals("M")){
            if(age>=20 && age<40){
                System.out.println("You will work anywhere");
            }
            else if(age>=40 && age<=60){
                System.out.println("You will placed only urban areas");
            }
            else{
                System.out.println("Error");
            }
        }
        else{
            System.out.println("Invalid input");
        }

    }
    
}
