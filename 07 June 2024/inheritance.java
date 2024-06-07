import java.util.Scanner;
class employee{
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    
    
    public void employeeintro(){
        System.out.println("my name is "+ name);
        System.out.println("I am an employee");
    }
}
class manager extends  employee{
    public void manageintro(){
        
        System.out.println("I am Manager of the company");
    }
    
}
class developer extends  manager{
    public void developerintro(){
        
        System.out.println("I am a developer");
    }
    
}
public class inheritance {
    public static void main(String[] args) {
        

        developer obj = new developer();
        obj.employeeintro();
        //obj.developerintro();
        obj.manageintro();
    }
    
}
