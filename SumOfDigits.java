import java.util.*;

public class SumOfDigits {
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int remainder = n % 10;
            sum += remainder;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            System.out.println("Sum of digits of number " + num + " is : " + sumOfDigits(num));
        } else {
            System.out.println("Please Enter Valid number.");
        }
        sc.close();
    }
}
