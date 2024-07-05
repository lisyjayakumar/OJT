import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ReverseVowel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = reverseVowels(input);
        System.out.println("String after reversing vowels: " + result);
        
        scanner.close();
    }

    public static String reverseVowels(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            while (left < right && !vowels.contains(chars[left])) {
                left++;
            }

            while (left < right && !vowels.contains(chars[right])) {
                right--;
            }

            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;

                left++;
                right--;
            }
        }

        return new String(chars);
    }
}
