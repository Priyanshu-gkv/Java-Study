import java.util.Scanner;;

public class percentage {
    public static void main(String args[]) {
        byte prcnt, sub1, sub2, sub3, sub4, sub5;
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter Your Marks.");
        System.out.print("Enter First Subject Marks : ");
        sub1 = s.nextByte();

        System.out.print("Enter Second Subject Marks : ");
        sub2 = s.nextByte();

        System.out.print("Enter Third Subject Marks : ");
        sub3 = s.nextByte();

        System.out.print("Enter Fourth Subject Marks : ");
        sub4 = s.nextByte();

        System.out.print("Enter Fifth Subject Marks : ");
        sub5 = s.nextByte();

        // byte total = 5;
        prcnt = (byte) ((sub1 + sub2 + sub3 + sub4 + sub5) / 5);

        System.out.println("The Percentage Of this student is : " + prcnt + "%");

        s.close();
    }
}