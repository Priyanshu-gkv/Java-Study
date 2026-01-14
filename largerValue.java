import java.util.*;

// FIND THE LARGEST NUMBER AMONG THREE NUMBERS

public class largerValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of a : ");
        int a = sc.nextInt();

        System.out.print("Enter the Value of b : ");
        int b = sc.nextInt();

        System.out.print("Enter the Value of c : ");
        int c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println("All values are equal.");
        } else {
            if (a > b && a > c) {
                System.out.println(a + " is the larger value.");
            } else if (b > c) {
                System.out.println(b + " is the larger value.");
            } else {
                System.out.println(c + " is the larger value");
            }
        }

        sc.close();
    }
}
