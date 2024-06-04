//access modifier = public , private , protected
//non-access modifiers = static, final, abstract;
class sample{
    public int x=100;
    private int  y=200;
    private static int q = 0;
    /*void data(){
        private int q=50;
    }*/
    private static void increment(){
        q++;
    }

    void show(){
        System.err.println("the value of x :"+ x);
        System.out.println("the value of y:"+y);
        sample.increment();
        sample.increment();
        System.out.println("The value of q :"+q);
    }
    
}
public class accessm {
    public static void main(String[] args) {
        sample obj = new sample();
        obj.show();
        
        
    }
    
}
