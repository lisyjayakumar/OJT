class Shape{
    void draw(){
        System.out.println(" \nDrawing a Shape");
    }
}
class circle extends Shape{
    @Override
    void draw(){

        System.out.println("Drawing circle");
    }
}
class rectangle extends Shape{
    @Override
    void  draw(){
        System.out.println("Drawing rectangle");
    }
}

public class drawshape {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Shape();
        shapes[1] = new circle();
        shapes[2]= new rectangle();
        for(Shape shape:shapes){
            shape.draw();
        }
    
        

    }
}
