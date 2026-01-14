import java.util.*;

public class areaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle : ");
        float r = sc.nextFloat();

        float area = (3.14f) * r * r;

        System.out.println("The Area of the Circle is : " + area);

        float circum = 2 * 3.14f * r;
        System.out.println("The Circumfarence of the circle is : " + circum);
        sc.close();

    }
}
