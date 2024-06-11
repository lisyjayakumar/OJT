import java.util.*;


public class arrayListex {
    public static void main(String[] args) {
       ArrayList<String> l1 = new ArrayList<>();
       l1.add("HTML");
       l1.add("JAVA");
       l1.add("JSP");
       l1.add("Servlet");
       System.out.println("Size :"+l1.size());
       for(String a : l1){
        System.out.println(a);
       }
       System.out.println(l1);
       System.out.println("element at index number 2: "+l1.get(2)); 
       System.out.println("-----------.-.-.-.-.-.-.-^^^^^-.-.-.-.-.-.-.-.-.-.-.-.-----");
       Iterator<String> itr = l1.iterator();
       while(itr.hasNext()){
        System.out.println(itr.next());
       }
    }
}
