/*Question4: Write a program to print the multiplication table of a number N, entered by the
user. */

import java.util.*;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        System.out.println("The Table of " + num + " is : ");
        int i = 1;
        while (i <= 10) {
            System.out.print(num + " X " + i + " = " + (num * i) + "\n");
            i++;
        }

        sc.close();

    }
}
