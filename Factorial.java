/*Question 3 :Write a program to find the factorial of any number entered by the user. */

import java.util.Scanner;

public class Factorial {

    // Factorial with Function

    public static int factorial(int a) {
        int fact = 1; // we didn't pass any condition for a = 0
        while (a > 0) { // here if a = 0 then it return only value of fact because a = 0 not >
            fact *= a;
            a--;
        }
        return fact; // value return fact = 1 if a = 0
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        /*
         * Without function
         * // int original = num;
         * // int factorial = 1;
         * // while (num > 0) {
         * // factorial *= num;
         * // num--;
         * // }
         */

        if (num < 0) {
            System.out.println("Please Enter Natural Number");
        } else {
            int result = factorial(num);
            System.out.println("The Facrorial of " + num + " is : " + result);
        }

        sc.close();
    }
}
