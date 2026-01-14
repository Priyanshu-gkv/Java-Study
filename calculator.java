import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        float operand1 = sc.nextFloat();

        System.out.print("Enter number 2 : ");
        float operand2 = sc.nextFloat();

        System.out.print("Enter operator (+,-,*,/,%) : ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(operand1 + operand2);
                break;
            case '-':
                System.out.println(operand1 - operand2);
                break;
            case '*':
                System.out.println(operand1 * operand2);
                break;
            case '/':
                System.out.println((double) (operand1 / operand2));
                break;
            case '%':
                System.out.println(operand1 % operand2);
                break;
            default:
                System.out.println("Your operator is wrong.");
        }
        sc.close();
    }
}
