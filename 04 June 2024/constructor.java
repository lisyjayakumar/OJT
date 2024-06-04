class rectangle{
   public int length, breadth, area;
    /*rectangle(){//nn-parameterized constructor
        System.out.println("---------------Calculating the area of a rectangle---------------");
    }*/
    rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;

    }
    
    public void calc(){
            area = length * breadth;
            System.err.println("There area  of the  rectangle is :"+area);
        
    }
}
public class constructor{
    public static void main(String[] args) {
        rectangle rec = new rectangle(12,5);
        rec.calc();
        
    }
}