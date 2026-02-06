public class ArrayPractice {

    public static boolean twiceFind(int num[]) {
        boolean isTwice = false;
        for (int i = 0; i < num.length; i++) {
            // 2nd loop - to iterate array 1 index before
            for (int j = i + 1; j < num.length; j++) {
                // Condition to check Is the number Present Twice in an array
                if (num[i] == num[j]) {
                    isTwice = true;
                    // System.out.println(num[i]);
                }
            }
        }
        return isTwice;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        System.out.println(twiceFind(arr));
    }
}
