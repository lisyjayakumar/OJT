
class A extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }
}
}
class B extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }
}
}
public class thread1 {
    public static void main(String[] args) {
        A a=new A();
        a.start();
        B b=new B();
        b.start();
        
    }
    
}
