import java.util.Scanner;
public class firstProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        
       for(int i =0; i<10 ; i++){
        int a= sc.nextInt();
    
        if(a < 0){     
            break;    
        }
        else{
            System.out.println(sum+=a); 
        }
        
       }
       
}
}
