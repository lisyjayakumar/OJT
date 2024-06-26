//12 Two Sum
import java.util.HashMap;

public class question12 {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(numbers[i])) {
                int index = map.get(numbers[i]);
                result[0] = index + 1;
                result[1] = i + 1;
                break;
            } else {
                map.put(target - numbers[i], i);
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        // Example usage:
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        
        question12 solution = new question12();
        int[] result = solution.twoSum(numbers, target);
        
        System.out.println("Indices of the two numbers whose sum is equal to target:");
        System.out.println("Index 1: " + result[0] + ", Index 2: " + result[1]);
    }
}
