import java.util.Scanner;

public class intcheck {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Integer Number : ");
        if (sc.hasNextInt()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        sc.close();

        // System.out.println(14.6 % 7.2); --> return decimal remainder
    }
}