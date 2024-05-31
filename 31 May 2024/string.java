public class string {
    public static void main(String[] args) {
        String s1 ="Hello World";
        int length = s1.length();
        System.out.println("length of a string is :"+length);
        //return the first occurance of a character or a string
        System.out.println(s1.indexOf("p"));
        System.out.println(s1.charAt(2));
        String s2 ="  Java ";
        System.out.println(s1.equals(s2));
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s2.trim());
       
        String s3 = s1.concat(s2);
    }
}
