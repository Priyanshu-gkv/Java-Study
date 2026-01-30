public class ReverseArray {

    public static void reversedArray(int numbers[]) {
        int start = 0, end = numbers.length - 1;

        // With for loop
        // for (int i = start; i < end; i++) {
        // int temp = numbers[end];
        // numbers[end] = numbers[start];
        // numbers[start] = temp;
        // start++;
        // end--;
        // }

        // With while loop
        while (start < end) {
            int temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;

            start++;
            end--;
        }

    }

    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 5 };
        reversedArray(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
        }
    }
}
