//Search Insert Position

public class question24 {
    public int searchInsert(int[] A, int target) {
        if (A == null || A.length == 0) {
            return 0;
        }
        
        if (target <= A[0]) {
            return 0;
        }
        
        for (int i = 0; i < A.length - 1; i++) {
            if (target > A[i] && target <= A[i + 1]) {
                return i + 1;
            }
        }
        
        return A.length;
    }
    
    public static void main(String[] args) {
        question24 solution = new question24();
        
        // Example 1
        int[] A1 = {1, 3, 5, 6};
        int target1 = 5;
        System.out.println("Index to insert " + target1 + ": " + solution.searchInsert(A1, target1)); // Output: 2
        
        // Example 2
        int[] A2 = {1, 3, 5, 6};
        int target2 = 2;
        System.out.println("Index to insert " + target2 + ": " + solution.searchInsert(A2, target2)); // Output: 1
        
        // Example 3
        int[] A3 = {1, 3, 5, 6};
        int target3 = 7;
        System.out.println("Index to insert " + target3 + ": " + solution.searchInsert(A3, target3)); // Output: 4
        
        // Example 4
        int[] A4 = {1, 3, 5, 6};
        int target4 = 0;
        System.out.println("Index to insert " + target4 + ": " + solution.searchInsert(A4, target4)); // Output: 0
    }
}
