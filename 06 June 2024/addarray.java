public class addarray {
    public static void main(String[] args) {
        int a[] = new int[5];
        int b[]= new int[5];
        int c[]= new int[5];
        int num = 5;

        for(int i= 0; i<a.length; i++){
            a[i]=i;
        }
        for(int i =0; i<b.length; i++){
            b[i]=num;
            ++num;
            

        }
        for(int i=0;i<c.length; i++){
            c[i]=a[i]+b[i];
        }
        System.out.println("values of array a :");
        for(int i=0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("\nvalues of array b :");
        for(int i=0; i<b.length;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println("\nvalues of array c :");
        for(int i=0; i<c.length;i++){
            System.out.print(c[i]+" ");
        }



    }
    
}
