import java.util.Arrays;

public class Anagrams {

    public static boolean anagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] chr1 = str1.toCharArray();
        char[] chr2 = str2.toCharArray();

        Arrays.sort(chr1);
        Arrays.sort(chr2);

        // System.out.println(chr1);
        // System.out.println(chr2);

        return Arrays.equals(chr1, chr2);
    }

    public static void main(String[] args) {
        String str1 = "care";
        String str2 = "Ceara";

        if (anagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are Anagrams String.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not Anagrams String.");
        }
    }
}
