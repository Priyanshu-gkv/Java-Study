import java.util.Scanner;

class Complex {

    public void complexNumbersAdd(int real1, int real2, int img1, int img2) {
        int realAdd = real1 + real2;
        int imgAdd = img1 + img2;

        if (realAdd == 0) {
            System.out.println(imgAdd + "i");
        } else if (imgAdd == 0) {
            System.out.println(realAdd);
        } else {
            System.out.println(realAdd + " + " + imgAdd + "i");
        }
    }

    public void complexNumbersSub(int real1, int real2, int img1, int img2) {
        int realSub = real1 - real2;
        int imgSub = img1 - img2;

        if (realSub == 0) {
            System.out.println("-" + imgSub + "i");
        } else if (imgSub == 0) {
            System.out.println(realSub);
        } else {
            System.out.println(realSub + " - " + "(" + imgSub + "i" + ")");
        }

    }

    public void complexNumbersMul(int real1, int real2, int img1, int img2) {
        int mul1 = (real1 * real2) - (img1 * img2);
        int mul2 = (real1 * img2) + (real2 * img1);

        System.out.println(mul1 + " + " + mul2 + "i");
    }
}

public class ComplexNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Real part of Complex Number 1 : ");
        int real1 = sc.nextInt();

        System.out.print("Enter Imaginary part of Complex Number 1 : ");
        int img1 = sc.nextInt();

        System.out.print("Enter Real part of Complex Number 2 : ");
        int real2 = sc.nextInt();

        System.out.print("Enter Imaginary part of Complex Number 2 : ");
        int img2 = sc.nextInt();

        Complex c = new Complex();

        System.out.print("Addition of Two Complex Numbers : ");
        c.complexNumbersAdd(real1, real2, img1, img2);

        System.out.print("Subtraction of Two Complex Numbers : ");
        c.complexNumbersSub(real1, real2, img1, img2);

        System.out.print("Multiplication of Two Complex Numbers : ");
        c.complexNumbersMul(real1, real2, img1, img2);
    }
}
