public class fibonacci {
    public static void main(String[] args) {
        int n=4;
        int a=0;
        int b=1;
        int c;
        for (int i=1; i<=n; i++){
            System.out.println(a+" ");
            c = a +b;
            a=b;
            b=c;
        }
    }}
    

