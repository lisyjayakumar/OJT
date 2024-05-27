class outerclass{
    int x = 5;
    class innerclass{
        int y=10;
    }
}
public class InnerClass{
    public static void main(String[] args) {
        outerclass outer = new outerclass();
        outerclass.innerclass inner = outer.new innerclass();
        System.out.println(outer.x + inner.y);
    }
}