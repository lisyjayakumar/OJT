

class Animal{
    void makesound(){
        System.out.println("the animal makes sound");
    }
}
class dog extends Animal{
    @Override
    void makesound(){
        System.out.println("the dog barks");
    }
}
class cat extends Animal{
    @Override
    void makesound(){
        System.out.println("Meow Meow");
    }
}
class cow extends Animal{
    @Override
    void makesound(){
        System.out.println("moos moos");
    }
}
public class methodOverriding {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Animal();
        animals[1] = new dog();
        animals[2]= new cat();
        animals[3] = new cow();
        for(Animal animal : animals){
            animal.makesound();
        }
        // Animal animal = new Animal();
        // Animal dogs = new dog();
        // Animal cats = new cat();
        // Animal cow = new cow();
        // animal.makesound();
        // dogs.makesound();
        // cats.makesound();
        // cow.makesound();
    }
    
    
    
}
