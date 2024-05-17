import java.util.Scanner;
public class medical {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Do you have any medical cause(Y/N) ?");

        String medicalcause = s.nextLine();
        if(medicalcause.equals("Y") || medicalcause.equals("y")){
            System.out.println("Take rest");

        }
        else if(medicalcause.equals("N") || medicalcause.equals("n")){
            System.out.println("Go to work");
        }
        else{
            System.out.println("Invalid input");
        }
    }
    
}
