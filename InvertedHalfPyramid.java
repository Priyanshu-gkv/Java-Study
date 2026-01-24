public class InvertedHalfPyramid {
    // Part - 1
    // public static void invertedHalfPyramid(int totalRows, int totalColumns) {
    // // loop for rows
    // for (int i = 1; i <= totalRows; i++) {
    // // loop for spaces
    // for (int j = 1; j <= totalRows - i; j++) {
    // System.out.print(" ");
    // }
    // // loop for stars
    // for (int j = 1; j <= i; j++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }
    // }

    // Part -2
    // only valid for square shape matrix
    // public static void halfPyramid(int totalRows, int totalColumns) {
    // for (int i = 1; i <= totalRows; i++) {
    // for (int j = 1; j <= totalColumns - (i - 1); j++) {
    // System.out.print(j);
    // }
    // for (int j = 1; j <= i - 1; j++) {
    // System.out.print(" ");
    // }
    // System.out.println();
    // }
    // }
    /*
     * Output
     * 12345
     * 1234
     * 123
     * 12
     * 1
     */

    // Part - 3

    // public static void pattern_3(int totalRows, int totalColumns) {
    // int num = 1;
    // for (int i = 1; i <= totalRows; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print(num + " ");
    // num++;
    // }
    // System.out.println();
    // }
    // }

    // Part - 4

    public static void zero1Pattern(int totalRows, int totalColumns) {
        for (int i = 1; i <= totalRows; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        // pattern_3(15, 15);
        zero1Pattern(5, 5);
    }
}
