class outerclass{
    int x =5;
    private class innerclass{
        int y =10;
    }
}
public class privateInnerclass {
    public static void main(String[] args) {
        outerclass outer = new outerclass();
       // outerclass.innerclass inner = outer.new innerclass();
        System.out.println(outer.x);
        //System.out.println(inner.Y);
        //cant access because the innerclass is private
    }
}
