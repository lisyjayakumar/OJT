class parent{
    String name;
    public parent(String s){
        name = s;
    }
    public void show_name(){
        System.out.println("Name : "+name);
    }
}
class child extends parent{
    int age;
    public child(String s, int g){
        super(s);
        age =g;
    }
    public void show_age(){
        System.out.println("Age :"+age);
    }
}

class grandchild extends child{
    String gender = "";
    public grandchild(String s, int g, String gen){
        super(s,g);
        gender= gen;
    }
    public void show_gender(){
        System.out.println("Gender: "+gender);
    }
}
public class multilevelInheritance {
    public static void main(String[] args) {
        grandchild obj = new grandchild("lisy", 22, "female");
        obj.show_name();
        obj.show_age();
        obj.show_gender();
    }
    
}
