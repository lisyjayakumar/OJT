class Animal{
    public void animalsound(){
        System.out.println("Animal makes a sound");
    }
}
class dog extends Animal{
    public String name = "Dog";
    public void animalsound(){
        System.out.println(name +": Boww BOww");
    }
}
class cat extends Animal{
    public String name ="cat";
    public void animalsound(){
        System.out.println(name +" : Meow Meow");
    }
}
public class polymorphism {
    public static void main(String[] args) {
        Animal animal = new Animal();
        cat Cats= new cat();
        dog Dogs = new dog();
        animal.animalsound();
       
        Cats.animalsound();
        
        Dogs.animalsound();
    }
    
}
