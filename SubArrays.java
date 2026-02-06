public class SubArrays {
    // Method - 1 (for time complexity - O(n^3))

    public static void subArrays(int arr[]) {

        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int j = i + 1; j <= arr.length; j++) {
                int sum = 0;
                for (int k = i; k < j; k++) {
                    sum += arr[k];
                    System.out.print(arr[k] + " ");

                }
                System.out.print("Sum is : " + sum);
                if (max < sum) {
                    max = sum;
                }
                if (min > sum) {
                    min = sum;
                }
                if (maxSum < sum) {
                    maxSum = sum;
                }
                System.out.println();
            }
            System.out.println("max is : " + max);
            System.out.println("min is : " + min);
            System.out.println();
        }
        System.out.println("Maximum Sum is : " + maxSum);
    }

    // Method - 2 (for time complexity - O(n^2))
    public static void maxSubArrays(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                if (i == 0) {
                    sum = prefix[j];
                } else {
                    sum = prefix[j] - prefix[i - 1];
                }
                if (maxSum < sum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println("Maximum Sum is : " + maxSum);
    }

    // Method - 3 (for time complexity - O(n))
    public static void kadanesMaxSubArrays(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // this block of code says kadanes algorithm
            // if (sum < 0) {
            // sum = 0;
            // }
            if (maxSum < sum) {
                maxSum = sum;
            }
        }
        System.out.println("Maximum Sum is : " + maxSum);
    }

    // Method -4 (for all negative number array)

    public static void subArraysMax(int arr[]) {
        int maxSum = arr[0];
        int sum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];

            if (arr[i] > sum) {
                sum = arr[i];
            }
            if (maxSum < sum) {
                maxSum = sum;
            }
        }
        System.out.println("Maximum Sum is : " + maxSum);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, -4, -5, -6, 7, 8 };
        // subArrays(arr);
        maxSubArrays(arr);
        // kadanesMaxSubArrays(arr);
        // subArraysMax(arr);
    }
}
