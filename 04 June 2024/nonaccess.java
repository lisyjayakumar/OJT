class nonaccex{
    public static int a = 0;
    public int b = 0;
    public final int z =0;
    public nonaccex(){
        a++;
        b++;
        //z++;
    }
    public void result(){
        System.out.println("the value of a :"+a);
        System.out.println("The value of b :"+b);
    }
}
public class nonaccess {
    public static void main(String[] args) {
        nonaccex  obj1 = new nonaccex();
        System.out.println("the value of a with help of an object "+obj1.a);
        System.out.println("the value of a with help of an object "+obj1.b);
        obj1.result();
        
        nonaccex  obj2 = new nonaccex();
        System.out.println("the value of a with help of an object "+obj2.a);
        System.out.println("the value of a with help of an object "+obj2.b);
        obj2.result();
       
    }
    }

