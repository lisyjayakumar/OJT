import java.util.*;
public class hashmapex{
    public static void main(String[] args) {
        HashMap<Integer,String> data = new HashMap<>();
        data.put(1,"Lisy");
        data.put(2,"cicili");
        data.put(3,"anu");
        data.remove(1,"akku");
        data.replace(2,"cicili","ammu");
        System.out.println("value at key number 1 :"+data.get(1));
        for(Integer key : data.keySet()){
            System.out.println("Key : " +key+" value :"+data.get(key));
        }
     

    }
}
