import java.util.*;

public class practice {
    public static void main(String[] args) {
        /*
         * Question 1 : In a program, input 3 numbers: A, B and C. Youhave to output the
         * average of
         * these 3 numbers.
         * (Hint : Average of N numbers is sum of those numbers divided by N)
         */

        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter First Number : ");
        // int a = sc.nextInt();
        // System.out.print("Enter Second Number : ");
        // int b = sc.nextInt();
        // System.out.print("Enter Third Number : ");
        // int c = sc.nextInt();

        // float avg = (float) (a + b + c) / 3;
        // System.out.println("The Average of 3 numbers is : " + avg);

        /*
         * Question 2: In a program, input the side of a square. You have to output the
         * area of the
         * square.
         * (Hint : area of a square is (side x side))
         */

        // System.out.print("Enter the side of Square : ");
        // float side = sc.nextFloat();

        // float area = side * side;

        // System.out.println("The Area of the square is : " + area);

        /*
         * Question 3: Enter cost of 3 items from the user (using float data type)- a
         * pencil, a pen and
         * an eraser. You have to output the total cost of the items back to the user as
         * their bill.
         * (Add on : You can also try adding 18% gst tax to the items in the bill as an
         * advanced problem)
         */

        // System.out.print("Enter the cost of the pencil : ");
        // float pencilPrice = sc.nextFloat();

        // System.out.print("Enter the cost of the pen : ");
        // float penPrice = sc.nextFloat();

        // System.out.print("Enter the cost of the eraser : ");
        // float eraserPrice = sc.nextFloat();

        // // Without gst (18%)
        // float totalBill = pencilPrice + penPrice + eraserPrice;
        // System.out.println("Total Bill (without GST) : " + totalBill);

        // With gst (18%)
        // float pencilGst = (pencilPrice * 18) / 100;
        // float penGst = (penPrice * 18) / 100;
        // float eraserGst = (eraserPrice * 18) / 100;

        // float totalBillWithGST = totalBill + penGst + pencilGst + eraserGst;

        // float grossGST = (totalBill * 18) / 100;
        // float totalBillWithGST = totalBill + ((totalBill * 18) / 100);

        // System.out.println("Total GST : " + grossGST);
        // System.out.println("Total Bill With GST : " + totalBillWithGST);

        // int $ = 50;// yes it is valid
        // System.out.println($);

        /*
         * Question1: Write a Java program to get a number from the user and print
         * whether it is
         * positive or negative.
         */
        // System.out.print("Enter number : ");
        // int num = sc.nextInt();

        // if (num > 0) {
        // System.out.println(num + " is a Positive number.");
        // } else {
        // System.out.println(num + " is a Negative number.");
        // }

        /*
         * Question2: Finish the following code so that it prints You have a fever if
         * your temperature
         * is above 100 and otherwise prints You don't have a fever.
         */

        // double temp = 93.5;
        // if (temp > 100) {
        // System.out.println("You have a fever.");
        // } else {
        // System.out.println("You are healthy.");
        // }

        /*
         * Question3: Writea Java program to input day number(1-7) and print day name
         * using switch case
         */

        // System.out.print("Enter day number : ");
        // int day = sc.nextInt();

        // switch (day) {
        // case 1:
        // System.out.println("Sunday");
        // break;
        // case 2:
        // System.out.println("Monday");
        // break;
        // case 3:
        // System.out.println("Tuesday");
        // break;
        // case 4:
        // System.out.println("Wednesday");
        // break;
        // case 5:
        // System.out.println("Thursday");
        // break;
        // case 6:
        // System.out.println("Friday");
        // break;
        // case 7:
        // System.out.println("Saturday");
        // break;
        // default:
        // System.out.println("You enter wrong number.");

        // }

        /*
         * Question5: Write a Java program that takes a year from the user and print
         * whether that
         * year is a leap year or not.
         */

        System.out.print("Enter year : ");
        int year = sc.nextInt();

        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        sc.close();
    }
}
