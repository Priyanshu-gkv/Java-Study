public class SpiralArray2D {

    public static void spiralMatrix(int arr[][]) {
        int startingRow = 0;
        int startingColumn = 0;
        int endingRow = arr.length - 1;
        int endingColumn = arr[0].length - 1;

        while (startingRow <= endingRow && startingColumn <= endingColumn) {
            // top
            for (int i = startingColumn; i <= endingColumn; i++) {
                System.out.print(arr[startingRow][i] + " ");
            }

            // right
            for (int j = startingRow + 1; j <= endingRow; j++) {
                System.out.print(arr[j][endingColumn] + " ");
            }

            // bottom
            for (int i = endingColumn - 1; i >= startingColumn; i--) {
                System.out.print(arr[endingRow][i] + " ");
            }

            // left
            for (int j = endingRow - 1; j >= startingRow + 1; j--) {
                System.out.print(arr[j][startingColumn] + " ");
            }
            startingColumn++;
            startingRow++;
            endingColumn--;
            endingRow--;
        }
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3 },
                { 5, 6, 7 },
                { 9, 10, 11 }
        };

        spiralMatrix(arr);
    }
}
