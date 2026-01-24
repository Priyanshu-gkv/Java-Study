public class SolidRohmbus {

    // public static void solidRohmbus(int totalRows) {
    // for (int i = 1; i <= totalRows; i++) {
    // for (int j = 1; j <= (totalRows - i); j++) {
    // System.out.print(" ");
    // }
    // for (int j = 1; j <= totalRows; j++) {
    // System.out.print(" *");
    // }
    // for (int j = 1; j <= (totalRows - 1) - (totalRows - i); j++) {
    // System.out.print(" ");
    // }
    // System.out.println();
    // }
    // }

    public static void hollowRohmbus(int n) {
        for (int i = 1; i <= n; i++) {
            // for (int j = 1; j <= (n - i); j++) {
            // System.out.print(" ");
            // }
            // if (i == 1 || i == n) {
            // for (int j = 1; j <= n; j++) {
            // System.out.print("* ");
            // }
            // } else {
            // for (int j = 1; j <= n - (n - 1); j++) {
            // System.out.print("* ");
            // }
            // }
            // for (int j = 1; j <= (n - 2); j++) {
            // System.out.print(" ");
            // }
            // if ((i != 1) && (i != n)) {
            // for (int j = 1; j <= n - (n - 1); j++) {
            // System.out.print("* ");
            // }
            // }
            // System.out.println();

            // method-2 for hollow rectangle to tilt it

            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        // solidRohmbus(15);
        hollowRohmbus(5);
    }

}