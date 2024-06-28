class A extends Thread{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("NSTI");
            try {
              
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
}
public class newthread {
    public static void main(String[] args) {
        A a = new A();
        a.start();
        for(int i=0; i<5;i++){
            System.out.println("ADIT");
            try {
                
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
}
