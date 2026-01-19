// Keep entering numbers till the user enters a multiple of 10

import java.util.*;

public class breakTill10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter Number : ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                System.out.println("Exit because you entered multiple of 10.");
                break;
            }
        } while (true);

        sc.close();
    }
}
