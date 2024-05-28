class Book {
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;
    
    public Book(String isbn, String title, String author) {
    this.isbn = isbn;
    this.title = title;
    this.author = author;
    this.isAvailable = true; 
    }
    public void borrow(){
        if(isAvailable){
            isAvailable = false;
            System.out.println("Book borrowed successfully");
        }
        else{
            System.out.println("Not available");
        }
    }
    public void returns(){
        if(!isAvailable){
            isAvailable =true;
            System.out.println("Book borrowed successfully");

        }
        else{
            System.out.println("Already returned");
        }
    }
    public void displayDetails(){
        System.err.println("ISBN :"+isbn);
        System.err.println("Title :"+title);
        System.err.println("Author :"+author);
        System.err.println("Availability :"+isAvailable);
    }
}
public class library{
    public static void main(String[] args) {
        Book first = new Book("1-5-1","Adujeevitham","Benyamin");
        first.displayDetails();
        first.borrow();
       // first.returns();
    }
}