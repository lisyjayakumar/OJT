
public class thread2 extends Thread{
    private String threadname;
    thread2(String name){
        threadname=name;
    }
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(threadname+" :"+i);
            try {
                Thread.sleep(500);
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        thread2 t1=new thread2("thread1");
        thread2 t2=new thread2("thread1");
        t1.start();
        t2.start();
        
    }
    
}
