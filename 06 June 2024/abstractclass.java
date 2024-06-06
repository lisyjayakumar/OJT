abstract class animal{
    abstract void animalsound();


}
class cat extends animal{
    public void animalsound(){
        System.out.println("Meow meow");
    }
}
class dog extends  animal{
    public void animalsound(){
        System.out.println("bow bow");
    }
}
public class abstractclass {
    public static void main(String[] args) {
      cat c = new cat();
      c.animalsound();
      dog d = new dog();
      d.animalsound();  
    }
}
