public class stringpalindrom {

    public static void main(String[]args){
        String word = "amma";
        String rev = new StringBuffer(word).reverse().toString();
        
        if(word.equals(rev)){
            System.out.println("palindrom");
        }
        else{
            System.out.println(" Not a palindrom");

        }
     

       
    }
    
}
