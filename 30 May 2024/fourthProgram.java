import java.util.Scanner;
class Person{
    String name;
    int age;
   public Person(String name,int age){
    this.name= name;
    this.age =age;

   }
   public void display(){
    System.out.println("Name: "+name+" Age "+age);
   }
   
   }  

public class fourthProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      
        String name = sc.nextLine();
      
        int age = sc.nextInt();
        Person per = new Person(name,age);
        per.display();

       
    
}
}
