import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int num;
        boolean isPrime = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        num = sc.nextInt();

        if (num < 2) {
            isPrime = false;
        } else if (num == 2) {
            isPrime = true;
        } else {
            for (int i = 2; i <= num - 1; i++) {
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
