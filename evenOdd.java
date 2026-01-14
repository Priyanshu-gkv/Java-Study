import java.util.*;

// TO FIND THE NUMBER IS EVEN OR ODD

public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt(); // for integer, in range of int

        // long num = sc.nextLong();// for long(big) numbers

        if (num % 2 == 0)
            System.out.println(num + " is even number.");
        else
            System.out.println(num + " is odd number.");

        sc.close();
    }
}
