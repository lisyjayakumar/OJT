class employee{
    private String name;
    private int age;
    public void setName(String newname){
        name = newname;
    }
    public String getName(){
        return name;
    }
    
    public void setAge(int newage){
       age=newage;
    }
    public void ageinc(){
        age++;
    }
    public void agedec(){
        age--;
    }
    public int getAge(){
        return age;
    }
}
public class encapsulation {
    public static void main(String[] args) {
        
        employee empobj = new employee();
        empobj.setName("Lisy J");
        System.out.println(empobj.getName());
        empobj.setAge(24);
        empobj.ageinc();
        System.out.println(empobj.getAge());System.out.println("-----------");
        empobj.agedec();
        System.out.println(empobj.getAge());
    }    
}
