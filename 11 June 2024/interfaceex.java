interface shape{
    double calarea();
    double calperimeter();

}
class rectangle implements shape{
    private double length ;
    private double width;
    public rectangle(double length, double width){
        this.length= length;
        this.width = width;
    }
    public double calarea(){
        return length*width;
    }
    public double calperimeter(){
        return (length+width)*2;
    }

}


public class interfaceex{
    public static void main(String[] args) {
        rectangle obj = new rectangle(10, 5);
        System.out.println("Area of rectangle is :"+obj.calarea());
        System.out.println("Perimeter of rectangle is :"+obj.calperimeter());
    }
}