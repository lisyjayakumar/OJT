class fruits{
    public void intro(){
        System.out.println("Iam a fruit");
    }
}

class apple extends fruits{
    public String name="Apple.";
    public void colour(){
        System.out.println(" I am in red colour.");

    }

}
public class inheritance {
    public static void main(String[] args) {
        apple a = new apple();
        System.out.println(" My name is "+a.name );
       
        a.intro();
        a.colour();
        
    }
    
}
