public class classMethod{
    public void firstMethod(){
        System.out.println("My name is Apple");

    }
    public void colorMethod(String color){
        System.out.println("I am in "+color+ " Colour.");
    }
    public static void main(String[] args){
        classMethod apple = new classMethod();
        apple.firstMethod();
        apple.colorMethod("red");
    }
}