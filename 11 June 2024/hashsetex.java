import java.util.*;
public class hashsetex {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("IBM");
        set.add("TCS");
        set.add("Infosys");
        set.add("Wipro");
        set.add("IBM");
        set.remove("Wipro");
        Iterator<String> itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    
}
