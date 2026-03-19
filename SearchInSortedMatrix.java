public class SearchInSortedMatrix {
    // Method - 1 (Brute Force Teachnique) O(n^2)
    public static void searchInMatrix(int arr[][], int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == key) {
                    System.out.println("Found at (" + i + "," + j + ").");
                }
            }
        }
    }

    // Method - 2 (StairCase Search Method) O(n)
    public static boolean searchInSortedMatrix(int arr[][], int key) {
        // Column Wise Teachnique
        // int row = 0, column = arr[0].length - 1;

        // while (row < arr.length && column >= 0) {
        // if (key == arr[row][column]) {
        // System.out.println("Key found at index (" + row + "," + column + ")");
        // return true;
        // } else if (key < arr[row][column]) {
        // column--;
        // } else {
        // row++;
        // }
        // }
        // System.out.println("Key Not Found!");
        // return false;

        // Row wise Teachnique
        int row = arr.length - 1, column = 0;

        int count = 1;
        while (row >= 0 && column < arr[0].length) {
            if (key == arr[row][column]) {
                System.out.println("Key found at index (" + row + "," + column + ")");
                System.out.println("And count is : " + count);
                return true;
            } else if (key < arr[row][column]) {
                row--;
                count++;
            } else {
                column++;
                count++;
            }
        }
        System.out.println("Key Not Found!");
        return false;
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        int arr1[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };

        searchInSortedMatrix(arr1, 25);
    }
}
