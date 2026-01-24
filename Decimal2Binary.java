import java.util.*;

public class Decimal2Binary {

    // Method - 1
    // ------------------------------------------------

    // public static String reverseBinary(String binary) {
    // String reverseBinary = "";
    // for (int i = ((binary.length()) - 1); i >= 0; i--) {
    // reverseBinary += binary.charAt(i);
    // }
    // return reverseBinary;

    // }

    // public static String decimal2Binary(int n) {
    // if (n < 0) {
    // return "Please Enter Positive number.";
    // }

    // if (n == 0) {
    // return "0";
    // }
    // String binary = "";
    // while (n > 0) {
    // int rem = n % 2;
    // binary += rem;
    // n = n / 2;
    // }
    // return reverseBinary(binary);
    // }

    // ------------------------------------------------

    // Method - 2
    // ------------------------------------------------
    public static String decimal2Binary(int num) {
        if (num < 0) {
            return "Please Enter Positive number.";
        }

        if (num == 0) {
            return "0";
        }
        String binary = "";
        while (num > 0) {
            int rem = num % 2;
            binary = rem + binary; // binary variable added in last (don't need to reverse the string)
            num = num / 2;
        }
        return binary;
    }
    // ------------------------------------------------

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Decimal Number : ");
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            System.out.println("The Binary number of " + num + " is : " + decimal2Binary(num));
        } else {
            System.out.println("Please Enter valid number.");
        }
        sc.close();
    }
}
