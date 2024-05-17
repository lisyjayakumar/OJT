public class primenot {
    public static void main(String[] args){
        int x = 4;
        boolean isprime = true;

        for(int i = 2; i<x;i++){
            if(x%i == 0){
                isprime=false;
                break;
            }
        }
        if(isprime){
            System.out.println(" prime");
        }
        else{
            System.out.println(" Not a prime");
        }
    }
}
