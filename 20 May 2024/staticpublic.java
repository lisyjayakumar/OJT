public class staticpublic {
    int x = 5;
    static void staticMethod(){
        System.out.println("static method");

    }
    public void publicMethod(){
        System.out.println("public method");
    }
    public static void main(String[] args) {
        staticMethod();
        staticpublic myobj = new staticpublic();
        myobj.publicMethod();
       System.out.println(myobj.x);
    }
}
