import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any letter to exit.");
        System.out.print("Enter Number : ");
        int evenSum = 0;
        int oddSum = 0;

        while (sc.hasNextInt()) { // check till user doesn't enter any letter
            int num = sc.nextInt();

            if (num % 2 == 0) {
                evenSum += num; // add all even numbers
            } else {
                oddSum += num; // add all odd numbers
            }
        }

        System.out.println("Even Numbers Sum is : " + evenSum);
        System.out.println("Odd Numbers Sum is : " + oddSum);

        sc.close();
    }
}