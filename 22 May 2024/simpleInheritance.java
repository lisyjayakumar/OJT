class Vehicle{
    public String Model = "2001";
}
class car extends Vehicle{
    public String name ="car";
    public String brand = "BMW";
}

public class simpleInheritance {
    public static void main(String[] args) {
        car c = new car();
        System.out.println("Name : "+ c.name);
        System.out.println("Model : "+ c.Model);
        System.out.println("Brand : "+ c.brand);
    }
}
