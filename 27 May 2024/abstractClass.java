abstract class Animal{
    public abstract void animalsound();
    public void sleep(){
        System.out.println("zzz");
    }
}
class cat extends Animal{
    public void animalsound(){
        System.out.println("MEow ");
    }
}
class abstractClass{
    public static void main(String[] args) {
        cat Mycat = new cat();
        Mycat.sleep();
        Mycat.animalsound();
    }
    
}