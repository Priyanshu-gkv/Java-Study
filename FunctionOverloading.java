// Function overloading depends on parameters, not on function return type

public class FunctionOverloading {
    // Function to calculate sum of 2 numbers
    public static int sum(int a, int b) {
        return a + b;
    }

    // Function to calculate sum of 2 numbers in float data type
    public static float sum(float a, float b) {
        return a + b;
    }

    // Function to calculate sum of 3 numbers
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(sum(5, 6));
        System.out.println(sum(5.6f, 7.8f));
        System.out.println(sum(6, 7, 8));
    }
}
