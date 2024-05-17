import java.util.Scanner;
public class mark {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your mak out of 100 : ");
        int mark = s.nextInt();
        if(mark<25){
            System.out.println("Mark : " +mark + " Grade : F");
        }
       else if(mark<45){
            System.out.println("Mark : " +mark + " Grade : E");
        }
        else if(mark<50){
            System.out.println("Mark : " +mark + " Grade : D");
        }
        else if(mark<60){
            System.out.println("Mark : " +mark + " Grade : C");
        }
        else if(mark<80){
            System.out.println("Mark : " +mark + " Grade : B");
        }
        else if(mark>80){
            System.out.println("Mark : " +mark + " Grade : A");
        }
        else{
            System.out.println("Your mark is invalid");
        }

    }
    
}
