//Minimum Size Subarray Sum

public class question23 {
    public static int minSubArrayLen(int s, int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        
        int result = nums.length + 1; // Initialize result to be larger than any possible subarray length
        int start = 0;
        int sum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            
            while (sum >= s) {
                result = Math.min(result, i - start + 1);
                sum -= nums[start++];
            }
        }
        
        return result == nums.length + 1 ? 0 : result;
    }
    
    public static void main(String[] args) {
        int s = 7;
        int[] nums = { 2, 3, 1, 2, 4, 3 };
        
        int minLength = minSubArrayLen(s, nums);
        System.out.println("Minimum length of subarray with sum >= " + s + ": " + minLength); // Output: 2
    }
}
