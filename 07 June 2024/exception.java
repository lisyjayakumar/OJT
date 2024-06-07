public  class exception{
    public static void main(String[] args) {
        try {
           
            System.out.println("x" + 5/0);  
        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
            System.out.println("hello");
        }
        
    }
}
