class A implements Runnable{
    public void run(){
        for(int i=1; i<=5;i++){
            System.out.println("thread: "+i);
        }
    }
}
class B implements Runnable{
    public void run(){
        for(int i=1; i<=5;i++){
            System.out.println("thread1:"+i);
    }
}
}
public class threadinterface2{
    public static void main(String[] args) {
        Thread a =new Thread(new A());
        Thread b=new Thread(new B());
        a.start();
        b.start();

    }
}