import java.util.*;

public class incomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Income or package in annual (per annum) : ");
        int income = sc.nextInt();

        float tax;
        if (income <= 500000) {
            tax = income * 0.0f;
            System.out.println("Your Tax to pay is : " + tax + "rs.");
        } else if ((income >= 500001) && (income <= 800000)) {
            tax = income * 0.05f;
            System.out.println("You have to pay " + tax + "rs tax.");
        } else if ((income >= 800001) && (income <= 1200000)) {
            tax = income * 0.1f;
            System.out.println("You have to pay " + tax + "rs tax.");
        } else if ((income >= 1200001) && (income <= 1600000)) {
            tax = income * 0.15f;
            System.out.println("You Have to pay " + tax + "rs tax.");
        } else if ((income >= 1600001) && (income <= 2000000)) {
            tax = income * 0.20f;
            System.out.println("You Have to pay " + tax + "rs tax.");
        } else if ((income >= 2000001) && (income <= 2400000)) {
            tax = income * 0.25f;
            System.out.println("You Have to pay " + tax + "rs tax.");
        } else if (income >= 2400001) {
            tax = income * 0.30f;
            System.out.println("You Have to pay " + tax + "rs tax.");
        }

        sc.close();

    }
}
