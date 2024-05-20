public class SimpleClass{
    int x= 5;
    public static void main(String[] args){
       
        SimpleClass obj1 = new SimpleClass();
        SimpleClass obj2 = new SimpleClass();

        obj2.x = 25;
        System.out.println(obj1.x);
        System.out.println(obj2.x);

    }
}