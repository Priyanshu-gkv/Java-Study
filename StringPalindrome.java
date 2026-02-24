public class StringPalindrome {

    public static void stringPalindrome(String str) {
        String reverseString = "";
        for (int i = 0; i < str.length(); i++) {
            reverseString += str.charAt(str.length() - 1 - i);
            // System.out.println(str.charAt(str.length() - 1 - i));
        }
        System.out.println(reverseString);

        if (str.equals(reverseString)) {
            System.out.println(str + " is Palindrome String");
        } else {
            System.out.println(str + " not a Palindrome String.");
        }
    }

    // Check till Half of the string
    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "ratar";
        // stringPalindrome(str);
        if (isPalindrome(str)) {
            System.out.println(str + " is Palindrome String");
        } else {
            System.out.println(str + " not a Palindrome String.");
        }
    }
}
