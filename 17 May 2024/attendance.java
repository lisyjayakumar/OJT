import java.util.Scanner;
public class attendance{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Number of classes attended?");
        int attendclass = sc.nextInt();
        System.out.println("Total number of classes ?");
        int totalclass = sc.nextInt();
      
       
        double attendancePercentage = ((double) attendclass / totalclass) * 100;
        System.out.println("Percentage of class attended : "+ attendancePercentage +"%");
        if(attendancePercentage < 75){
            System.out.println("You cannot attend the exam because your less attendance percentage");
        }
        else{
            System.out.println("Congrats ! You can attend the exam");
        }
    }
}
