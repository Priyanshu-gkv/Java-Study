import java.util.*;

public class ButterflyPattern {

    public static void butterflyPattern(int totalRows) {
        // 1st half
        for (int i = 1; i <= totalRows; i++) {
            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // spaces - 2*(totalRows - i)
            for (int j = 1; j <= 2 * (totalRows - i); j++) {
                System.out.print("  ");
            }
            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // 2nd half
        for (int i = totalRows; i >= 1; i--) {
            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // spaces - 2*(totalRows - i)
            for (int j = 1; j <= 2 * (totalRows - i); j++) {
                System.out.print("  ");
            }
            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("i.g. If you entered 4 then it may consider as (4 X 2 = 8).");
        System.out.print("Enter Number of rows : ");
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            System.out.println("Your number is considered as " + (num * 2));

            butterflyPattern(num);
        } else {
            System.out.println("Please Enter Valid Number.");
        }
        sc.close();
    }
}
