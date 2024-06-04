abstract class car{
    car(){
        System.out.println("Owner is John");
    }
    abstract void brandName();
    public void color(){
        System.out.println("color of the car is black");
    }
}
class car1 extends car{
    public void brandName(){
        System.out.println("The brand name of the car is AUDI");
    }
}
class car2 extends car{
    public void brandName(){
        System.out.println("The bran name of the car is hundai");
    }
}
public class abstraction {
    public static void main(String[] args) {
        car obj = new car1();
        obj.brandName();
        obj.color();
    }
}
