// import java.util.*;

public class TrappedWater {

    // time complexity - O(n^2) (because 2 nested loops run to lenght n)
    public static int trappedWater(int height[], int width) {
        int leftMaxArr[] = new int[height.length];
        int rightMaxArr[] = new int[height.length];
        int trapped = 0;
        for (int i = 0; i < height.length; i++) {

            int leftmax = Integer.MIN_VALUE;
            // Loop for left max bar
            for (int j = i; j >= 0; j--) {
                if (height[j] > leftmax) {
                    leftmax = height[j];
                }
            }
            leftMaxArr[i] = leftmax;

            int rightmax = Integer.MIN_VALUE;
            // Loop for right max bar
            for (int j = i; j < height.length; j++) {
                if (height[j] > rightmax) {
                    rightmax = height[j];
                }
            }
            rightMaxArr[i] = rightmax;
        }

        for (int i = 0; i < height.length; i++) {
            trapped += ((Math.min(leftMaxArr[i], rightMaxArr[i])) - height[i]) * width;
        }
        return trapped;
    }

    // time complexity - O(n)

    public static int trapped_water(int len[], int width) {
        int leftMaxArr[] = new int[len.length];
        int rightMaxArr[] = new int[len.length];
        int trapped = 0;

        leftMaxArr[0] = len[0];
        for (int i = 1; i < len.length; i++) {
            leftMaxArr[i] = Math.max(len[i], leftMaxArr[i - 1]);
        }

        rightMaxArr[len.length - 1] = len[len.length - 1];
        for (int i = len.length - 2; i >= 0; i--) {
            rightMaxArr[i] = Math.max(len[i], rightMaxArr[i + 1]);
        }

        for (int i = 0; i < len.length; i++) {
            trapped += ((Math.min(leftMaxArr[i], rightMaxArr[i])) - len[i]) * width;
        }
        return trapped;

    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        // int height[] = { 4, 2, 6 };
        int width = 1;

        System.out.println(trappedWater(height, width));
        System.out.println(trapped_water(height, width));
    }
}
