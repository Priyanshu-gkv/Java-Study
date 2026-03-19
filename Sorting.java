public class Sorting {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swap = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }

        printArray(arr);

    }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        printArray(arr);
    }

    public static void insertionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        printArray(arr);
    }

    public static void countingSort(int arr[]) {
        int maxNo = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxNo = Math.max(maxNo, arr[i]);
        }

        int count[] = new int[maxNo + 1];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
            // System.out.print(count[arr[i]] + " ");
        }

        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }

    public static void main(String[] args) {
        int arr1[] = { 5, 4, 1, 3, 2 };
        int arr2[] = { 1, 12, 43, 14, 35 };
        int arr3[] = { 2, 5, 8, 7, 6, 1, 3 };
        int arr4[] = { 12, 11, 13, 5, 6 };
        int arr5[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        // bubbleSort(arr1);
        // bubbleSort(arr2);
        // selectionSort(arr5);
        // insertionSort(arr5);
        countingSort(arr5);
        // System.out.println();
        printArray(arr5);

    }
}
