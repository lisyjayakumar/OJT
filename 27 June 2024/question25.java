import java.util.*;
//25 Longest Consecutive Sequence

    

public class question25 {

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int longestLength = longestConsecutive(nums);
        System.out.println("Longest consecutive sequence length: " + longestLength);
    }

    public static int longestConsecutive(int[] num) {
        // if array is empty, return 0
        if (num.length == 0) {
            return 0;
        }
        
        Set<Integer> set = new HashSet<>();
        int max = 1;
        
        for (int e : num)
            set.add(e);
        
        for (int e : num) {
            int left = e - 1;
            int right = e + 1;
            int count = 1;
            
            while (set.contains(left)) {
                count++;
                set.remove(left);
                left--;
            }
            
            while (set.contains(right)) {
                count++;
                set.remove(right);
                right++;
            }
            
            max = Math.max(count, max);
        }
        
        return max;
    }
}
