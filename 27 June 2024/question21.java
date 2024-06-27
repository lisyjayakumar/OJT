//Longest Valid Parentheses
import java.util.Stack;

public class question21 {
    public static int longestValidParentheses(String s) {
        Stack<int[]> stack = new Stack<>();
        int result = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                int[] a = { i, 0 };
                stack.push(a);
            } else { // c == ')'
                if (!stack.isEmpty() && stack.peek()[1] == 0) {
                    stack.pop();
                    int currentLen = 0;
                    if (stack.isEmpty()) {
                        currentLen = i + 1;
                    } else {
                        currentLen = i - stack.peek()[0];
                    }
                    result = Math.max(result, currentLen);
                } else {
                    int[] a = { i, 1 };
                    stack.push(a);
                }
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        String input = "(()()";
        System.out.println(longestValidParentheses(input)); // Output: 4
    }
}
