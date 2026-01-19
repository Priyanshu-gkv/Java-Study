public class callByValue {

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 6;

        System.out.println("Call by value (copy values of a variable).");
        swap(a, b); // call by value (change in copy variable)

        // not change in original value
        System.out.println();
        System.out.println("Not change in original value");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
