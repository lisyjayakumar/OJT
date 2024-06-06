interface Phone{
    public void cost();
    public void color();
    public void batterylife();
    
}
class Iphone implements Phone{
    public void cost(){
System.out.println("Cost of iphone is 600$");
    }
    public void color(){
        System.out.println("Color of iphone is blue");
        
    }
    public void batterylife(){
        System.out.println("battery life 16 hrs");
        
    }
}
public class interfaces{
    public static void main(String[] args){
Iphone ip = new Iphone();
ip.color();
ip.cost();
ip.batterylife();
    }
}