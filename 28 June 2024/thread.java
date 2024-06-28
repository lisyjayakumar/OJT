class A extends Thread{
   
    public void run(){
    for(int i=1;i<=5;i++){
        System.out.println("NSTI");
    }
    }
}
public class thread {
    public static void main(String[] args) {
        A t1 = new A();
        t1.start();
        for(int i=1;i<=5;i++){
            System.out.println("main thread");
        }
    }
    
}
