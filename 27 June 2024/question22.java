//Implement strStr()

public class question22 {
    public static int strStr(String haystack, String needle) {
        if (haystack == null || needle == null)
            return -1;
        if (needle.length() == 0)
            return 0;
        
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            boolean found = true;
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return i;
            }
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        
        int index = strStr(haystack, needle);
        System.out.println("Index of first occurrence: " + index); // Output: 2
    }
}
