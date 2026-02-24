public class LargestString {

    public static void largestString(String str[]) {
        // System.out.println(str[0].length());
        int arr[] = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = str[i].length();
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            // System.out.print(arr[i] + " ");
            max = Math.max(arr[i], max);
        }

        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i]) {
                System.out.println(str[i]);
            }
        }

    }

    // String With No extra array needed
    public static void largestStr(String str[]) {
        int max = 0;
        for (String s : str) {// for each loop
            if (max < s.length()) {
                max = s.length();
            }
        }

        for (String s : str) {
            if (max == s.length()) {
                System.out.println(s);
            }
        }
    }

    // Function compare in Lexicographic pattern (finds alphabetically largest)
    public static void largestStringLexicographivPattern(String str[]) {
        String largest = "";
        for (String s : str) {
            if (largest.compareTo(s) < 0) {// compare in lexicographical pattern
                largest = s;
            }
        }
        System.out.println(largest);
    }

    public static void main(String[] args) {
        String str[] = { "hello", "banana", "Apple", "iello Everyone How are you?" };

        // largestString(str);
        // System.out.println(largestStr(str));
        // largestStr(str);
        largestStringLexicographivPattern(str);
    }
}
