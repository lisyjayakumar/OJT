//9 Regular Expression Matching in Java
public class question9 {
    public boolean isMatch(String s, String p) {
        if (p.length() == 0)
            return s.length() == 0;

        // p’s length 1 is special case
        if (p.length() == 1 || p.charAt(1) != '*') {
            if (s.length() < 1 || (p.charAt(0) != '.' && s.charAt(0) != p.charAt(0))) {
                return false;
            } else {
                return isMatch(s.substring(1), p.substring(1));
            }
        } else {
            int len = s.length();
            int i = -1;
            while (i < len && (i < 0 || p.charAt(0) == '.' || p.charAt(0) == s.charAt(i))) {
                if (isMatch(s.substring(i + 1), p.substring(2))) {
                    return true;
                }
                i++;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        question9 matcher = new question9();

        // Test cases
        String s1 = "aa";
        String p1 = "a";
        System.out.println(matcher.isMatch(s1, p1)); // Expected output: false

        String s2 = "aa";
        String p2 = "a*";
        System.out.println(matcher.isMatch(s2, p2)); // Expected output: true

        String s3 = "ab";
        String p3 = ".*";
        System.out.println(matcher.isMatch(s3, p3)); // Expected output: true

        String s4 = "aab";
        String p4 = "c*a*b";
        System.out.println(matcher.isMatch(s4, p4)); // Expected output: true

        String s5 = "mississippi";
        String p5 = "mis*is*p*.";
        System.out.println(matcher.isMatch(s5, p5)); // Expected output: false
    }
}
