class example{
    public void display(){
        System.out.println("Method without parameter");
    }
    public void display(int a, int b){
        System.out.println("Method with different data type "+a+","+b);
    }
    public void display (double a,int b){
        System.out.println("Method with mix datatypes :"+a+","+b);
    }
}
public class polymorphism {
    public static void main(String[] args) {

        example obj = new example();
        obj.display();
        obj.display(5,7);
        obj.display(1.5,5);
    }
    }

