public class DiamondPattern {

    public static void dimaondPattern(int n) {

        // 1st half
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            // stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            // spaces(ignore)
            // for (int j = 1; j <= (n - i); j++) {
            // System.out.print(" ");
            // }
            System.out.println();
        }

        // 2nd half

        for (int i = n - 1; i >= 1; i--) {// here n-1 is the intialization condition of loop because i don,t want to
                                          // print last line again in mirror
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            // for (int j = 1; j <= (n - i); j++) {
            // System.out.print(" ");
            // }
            System.out.println();
        }
    }

    // number pyramid
    public static void numberPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            // for (int j = 1; j <= 1; j++) {
            // System.out.print(" ");
            // }
            System.out.println();
        }
    }

    // Palindromic Pattern

    public static void palindromicPattern(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // descending loop
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // assending loop
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // dimaondPattern(4);
        // numberPyramid(5);
        palindromicPattern(5);
    }
}
