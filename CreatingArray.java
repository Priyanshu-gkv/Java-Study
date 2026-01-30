import java.util.*;

public class CreatingArray {

    public static int binarySearch(int array[], int number) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] > number) {
                end = mid - 1;
                // mid = (start + end) / 2;
            } else if (array[mid] < number) {
                start = mid + 1;
                // mid = (start + end) / 2;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int largestNumber(int array[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (largest < array[i]) {
                largest = array[i];
            }
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        System.out.println("Smallest value in an array is : " + smallest);
        return largest;
    }

    public static int linearSearch(int marks[], int key) {
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int array[] = new int[15];
        // if (sc.hasNextInt()) {
        // for (int i = 0; i < 15; i++) {
        // array[i] = sc.nextInt();
        // }
        // } else {
        // System.out.println("Please Enter Valid Integer");
        // }

        // System.out.print("Enter Number to Search in your array : ");
        // int key = sc.nextInt();
        // // System.out.println(numbers);
        // int result = linearSearch(array, key);
        // if (result != -1) {
        // System.out.println(key + " Found in an array at index " + result);
        // } else {
        // System.out.println("Not Found in an array.");
        // }

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 67, 78 };
        // System.out.println(largestNumber(arr) + " is the largest number in your
        // array.");
        int number = 78;
        if (binarySearch(arr, number) != -1) {
            System.out.println("Found at index " + binarySearch(arr, number));
        } else {
            System.out.println("Number Not Found.");
        }

        sc.close();
    }
}
