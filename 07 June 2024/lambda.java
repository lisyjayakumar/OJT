import java.util.ArrayList;
public class lambda {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
//for loop
        /*for(int i = 0; i<5;i++){
            System.out.println(numbers[i]);

        }*/
//for each
        for(int i :numbers){
            System.out.println(i);
        }
//lambda
numbers.forEach( (n) -> { System.out.println(n); } );
    }
    
}
