import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int num;
        boolean isPrime = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        num = sc.nextInt();

        // METHOD - 1 (time taken for large values : (n-2))
        // if (num < 2) {
        // isPrime = false;
        // } else if (num == 2) {
        // isPrime = true;
        // } else {
        // for (int i = 2; i <= num - 1; i++) {
        // if (num % i == 0) {
        // isPrime = false;
        // }
        // }
        // }

        // if (isPrime == true) {
        // System.out.println(num + " is a prime number.");
        // } else {
        // System.out.println(num + " is not a prime number");
        // }

        // METHOD - 2 (time taken for large values : sqrt(n) which is [sqrt(n) < (n-2)])
        if (num < 2) {
            isPrime = false;
        } else if (num == 2) {
            isPrime = true;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) { // less time taken for large values (so efficient condition)
                if (num % i == 0) {
                    isPrime = false;
                }
            }
        }

        if (isPrime == true) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number");
        }

        sc.close();
    }
}
