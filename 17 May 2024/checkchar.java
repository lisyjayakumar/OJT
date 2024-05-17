public class checkchar {
    public static void main(String[] args) {
        char first = 'a';
        if(first >=65 && first<=90){
            System.out.println(" This is uppercase letter");
        }
        else if(first>=97 && first <=122){
            System.out.println(" This is lowercase letter");
        }
        else{
            System.out.println("Invalid character");
        }
    }
    
}
