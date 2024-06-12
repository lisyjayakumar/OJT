class Encapsulatedclass{
    private String data;
    public String getData(){
        return data;
    }
    public void setData(String data){
        this.data=data;
    }
}

public class excercise3 {
    public static void main(String[] args) {
        Encapsulatedclass  obj = new Encapsulatedclass();
        obj.setData("Hello");
        System.out.println(obj.getData());
    }
    
}
