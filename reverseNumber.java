import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        // Method - 1 (With the help of String)
        // int m = n;
        // String temp = ""; // we have intialize empty string becuase int + String =
        // String
        // while (n > 0) {
        // m = n % 10;
        // temp += m;
        // n = n / 10;
        // }

        // System.out.println("Reverse Number is : " + temp);

        // Method - 2 (only print number one by one)
        // System.out.print("REVERSE NUMBER IS : ");
        // while (n > 0) {
        // System.out.print(n % 10);
        // n = n / 10;

        // }

        // METHOD - 3

        int reverse = 0;
        while (n > 0) {
            int m = n % 10;
            reverse = (reverse * 10) + m;
            n = n / 10;
        }

        System.out.println("Reverse Number is : " + reverse);

        sc.close();
    }
}
