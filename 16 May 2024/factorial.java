public class factorial {

    public static void main(String[] args) {
        int fact=1;
        int n = 4;
        for (int i = 1; i<=n; i++){
           fact=fact*i;
        }
    System.out.println("factorial of "+n+"is: "+fact);
    
}
}
