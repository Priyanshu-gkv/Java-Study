import java.util.Scanner;

public class sumFirstn {
    public static void main(String[] args) {
        System.out.println("Sum of First n natural Numbers.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.print("The Sum of first " + n);
        int sum = 0;
        while (n > 0) {
            sum += n;
            n--;
        }

        System.out.println(" natural numbers is : " + sum);
        sc.close();
    }
}
