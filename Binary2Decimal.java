import java.util.*;

public class Binary2Decimal {

    public static boolean isBinary(int n) {
        while (n > 0) {
            int lastDigit = n % 10;
            if (lastDigit != 0 && lastDigit != 1) {
                return false;
            }
            n = n / 10;
        }
        return true;
    }

    public static int powerFunction(int base, int power) { // user-defined power function
        int powerResult = 1;
        for (int i = 1; i <= power; i++) {
            powerResult *= base;
        }

        return powerResult;
    }

    public static int binary2Decimal(int n) {
        if (!(isBinary(n))) {
            System.out.println("Please Enter Valid Binary Number.");
            return -1;
        } else {
            int pow = 0;
            int decimal = 0;

            while (n > 0) {
                int lastDigit = n % 10;
                decimal += lastDigit * powerFunction(2, pow);
                n = n / 10;
                pow++;
            }

            // System.out.println(decimal);
            return decimal;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter binary number : ");
        int num = sc.nextInt();
        // binary2Decimal(num);

        int result = binary2Decimal(num);
        if (result != -1) {
            System.out.println("The Decimal number of " + num + " is : " + result);
        } else {
            System.out.println(result);
        }
        sc.close();

        // System.out.println(powerFunction(3.4, 3));
    }
}
