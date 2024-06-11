
public class multithreading {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable("ADIT"));
        Thread thread2 = new Thread(new MyRunnable("IBM"));
        thread1.start();
        thread2.start();

    }
    static class MyRunnable implements Runnable{
        private String threadName;
        // thread
        public MyRunnable(String name){
            this.threadName = name;
        }
        public void run(){
            for(int i=0; i<5; i++){
                System.out.println(threadName+" running " + i);
                try{
                    //thread inbuilt class from runnable
                    Thread.sleep(5000);// wait for another iteration eg 1 second
                }
                catch(InterruptedException e){
                    e.printStackTrace();//inbuilt message error displayed as message
                }
            }
        }
    }
}
