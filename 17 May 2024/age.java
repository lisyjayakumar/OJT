import java.util.Scanner;
public class age{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter renu's age? ");
        int reenuage = s.nextInt();
        System.out.println("Enter meenu's Age? ");
        int meenuage = s.nextInt();
        System.out.println("Enter tomy's Age? ");
        int tomyage=s.nextInt();
        if((reenuage == meenuage) && (meenuage == tomyage)){
            System.out.println("All are same age");
        }

        else if(reenuage > meenuage && reenuage>tomyage){
            System.out.println("Renu is the oldest");
        
        }
        else if(meenuage > reenuage && meenuage > tomyage){
            System.out.println("Meenu is the oldest");
        }
        else{
            System.out.println("Tomy is the oldest");
        }
    }
}