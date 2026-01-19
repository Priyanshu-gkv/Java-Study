import java.util.*;

public class BinomialCofficient {

    public static int factorial(int n) {
        int fact = 1;
        while (n > 0) {
            fact *= n;
            n--;
        }

        return fact;
    }

    public static void main(String[] args) {
        System.out.println("Calculate Binomial Cofficient.");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n in (n,r) : ");
        int n = sc.nextInt();

        System.out.print("Enter value of r in (n,r) : ");
        int r = sc.nextInt();

        int nFactorial = factorial(n);
        int rFactorial = factorial(r);
        int nrFactorial = factorial(n - r);

        int binomialCofficient = nFactorial / (rFactorial * nrFactorial);

        System.out.println("The binomial Cofficient of (" + n + "," + r + ") is : " + binomialCofficient);
        sc.close();
    }
}
