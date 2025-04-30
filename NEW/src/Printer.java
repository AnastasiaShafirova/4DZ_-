class PalindromeChecker {
    public static boolean isPalindrome(String input) {
        String processed = input.replace(" ", "");
        processed = processed.toLowerCase();
        int length = processed.length();
        for (int i = 0; i < length / 2; i++) {
            if (processed.charAt(i) != processed.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
public class Printer {
    public static void main(String[] args) {
        String input;
        if (args.length > 0) {
            input = args[0];
        } else {
            input = "Hello";
        }
        boolean result = PalindromeChecker.isPalindrome(input);
        if (result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

}