import java.util.*;

public class MultipleTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter the Starting Number of table : ");
        // int start = sc.nextInt();

        System.out.print("Enter the Last number of table : ");
        int last = sc.nextInt();

        int i = 1;

        while (i <= last) {
            int j = 1;

            while (j <= 10) {
                System.out.print(i + " X " + j + " = " + (j * i) + "\n");
                j++;
            }
            System.out.println("\n");
            i++;
        }

        // for (i = 1; i <= last; i++) {
        // System.out.println("Table of " + i);
        // for (j = 1; j <= 10; j++) {
        // System.out.print(i + " X " + j + " = " + (j * i) + "\n");
        // }
        // System.out.println();
        // }
        sc.close();

    }
}
