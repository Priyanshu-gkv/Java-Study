import java.util.*;

public class PalindromeCheck {

    public static int numberLength(int n) {
        int counter = 0;
        while (n > 0) {
            n = n / 10;
            counter++;
        }
        return counter;
    }

    public static int palindromeCheck(int n) {
        int reverseNumber = 0;
        // int pow = numberLength(n) - 1;
        while (n > 0) {
            int remainder = n % 10;
            // reverseNumber += remainder * Binary2Decimal.powerFunction(10, pow);
            reverseNumber = reverseNumber * 10 + remainder;
            n = n / 10;
            // pow--;
        }
        return reverseNumber;
    }

    public static boolean isPalindrome(int originalNumber) {
        // int reverseNumber = palindromeCheck(originalNumber);
        // if (reverseNumber == originalNumber) {
        // return true;
        // }
        // return false;
        return palindromeCheck(originalNumber) == originalNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number (To Check Palindrome) : ");
        // int number = sc.nextInt();
        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            if (isPalindrome(number)) {
                System.out.println(number + " is a Palindrome Number.");
            } else {
                System.out.println(number + " is not a Palindrome Number.");
            }
        } else {
            System.out.println("Please Enter Valid Number.");
        }
        sc.close();
    }
}
