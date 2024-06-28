class A implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("this is my child thread");
}

}
}
public class interfacethread {
    public static void main(String[] args) {
        Thread obj = new Thread(new A());
        obj.start();
        
        for(int i=0;i<5;i++){
            System.out.println("this is my main thread");
}


    }
    
}
