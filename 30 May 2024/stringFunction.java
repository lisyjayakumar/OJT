import java.util.*;

class stringfunc{
    String a;
    Scanner sc=new Scanner(System.in);
    public void accept(){
        a = sc.nextLine();
        System.out.println(); 
    }

    public void show(){
        char[] ch= a.toCharArray();
        String c = " ";
        for(int i=0;i<ch.length;i++)
        {
            System.out.println(ch[i]);
        }
        System.out.println();
        System.out.println(Arrays.toString(ch));
        System.out.println();
        System.out.println(a.charAt(5));
        System.out.println("-----------------------------");
       // while(sc.hasNext()){
            //String s1 = sc.next();
            c+=Character.toUpperCase(a.charAt(0))+a.substring(1)+" " ;   
          //  }
            System.out.print(c.trim());
        }
    }

public class stringFunction {
    public static void main(String[] args) {
        stringfunc sf = new stringfunc();
        sf.accept();
        sf.show();
    }
}