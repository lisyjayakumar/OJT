//8 Wildcard Matching
public class question8 {

    public static void main(String[] args) {
        question8 mainObj = new question8();

        // Test cases
        String s1 = "aa";
        String p1 = "a";
        System.out.println(mainObj.isMatch(s1, p1)); // Expected output: false

        String s2 = "aa";
        String p2 = "*";
        System.out.println(mainObj.isMatch(s2, p2)); // Expected output: true

        String s3 = "cb";
        String p3 = "?a";
        System.out.println(mainObj.isMatch(s3, p3)); // Expected output: false

        String s4 = "adceb";
        String p4 = "*a*b";
        System.out.println(mainObj.isMatch(s4, p4)); // Expected output: true

        String s5 = "acdcb";
        String p5 = "a*c?b";
        System.out.println(mainObj.isMatch(s5, p5)); // Expected output: false
    }

    public boolean isMatch(String s, String p) {
        int i = 0;
        int j = 0;
        int starIndex = -1;
        int iIndex = -1;

        while (i < s.length()) {
            if (j < p.length() && (p.charAt(j) == '?' || p.charAt(j) == s.charAt(i))) {
                ++i;
                ++j;
            } else if (j < p.length() && p.charAt(j) == '*') {
                starIndex = j;
                iIndex = i;
                j++;
            } else if (starIndex != -1) {
                j = starIndex + 1;
                i = iIndex + 1;
                iIndex++;
            } else {
                return false;
            }
        }

        while (j < p.length() && p.charAt(j) == '*') {
            ++j;
        }

        return j == p.length();
    }
}
