import java.util.Scanner;

public class km2miles {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Km. value : ");
        int km = sc.nextInt();

        double miles = (km) * (1.609344);
        System.out.println("There is " + miles + " miles in " + " km.");
        sc.close();
    }
}
