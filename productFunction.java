import java.util.Scanner;

public class productFunction {

    public static float product(float a, float b) {
        float multiplyResult = a * b;
        return multiplyResult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number 1 : ");
        float a = sc.nextFloat();
        System.out.print("Enter Number 2 : ");
        float b = sc.nextFloat();

        float prdct = product(a, b);
        System.out.println("Product of " + a + " and " + b + " is : " + prdct);
        sc.close();

    }
}
