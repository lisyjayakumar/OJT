import java.util.Scanner;


abstract class  Shapes{
    int length;
    int width;
    int radius;
    public abstract void calculateArea();
    
}
class rectangle extends Shapes{
  
    public void calculateArea(int l, int w){
        
        length = l;
        width = w;
        System.out.println("Area of a rectangle is :"+ l*w);
    }
}
class circle extends rectangle{
    
   
    public void calculateArea(int r){
        double pie = 3.14;
        radius = r;
        double rsq = r*r;

        System.out.println("Area of a circle :"+(pie*rsq));
    }

}
public class shape {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the length of rectangle :");
        int len = s.nextInt();
        System.out.println("Enter the width of rectangle :");
        int wid = s.nextInt();
        System.out.println("Enter the radius of circle");
        int rad = s.nextInt();

        circle obj = new circle();
       
        obj.calculateArea(len,wid);
        
        obj.calculateArea(rad);




    }
}
