class Student{
    private String studentName;
    private String studentId;
    private int Grade;
   
    public String getName(){
        return studentName;
    }
    public String getId(){
        return studentId;
    }
    public void getGrade(){
        if(this.Grade == 0){
            System.out.println("invalid grade");
        }
        else{
            System.out.println("Grade :"+Grade);
        }
        
    }
   
    public void setName(String newName){
        studentName=newName;
    }
    public void setId(String newId){
        studentId=newId;
    }
    public void setGrade(int newGrade){
        if(newGrade >= 0 && newGrade <= 100){
            Grade = newGrade;
        } 
}

}
public class encapsulationex{
    
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setName("Lisy");
        obj.setId("1001adit");
        obj.setGrade(150);
       
        System.out.println("Name :"+obj.getName());
        System.out.println("Student Id :"+obj.getId());
        obj.getGrade();
    }
}