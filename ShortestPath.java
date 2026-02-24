public class ShortestPath {

    public static double shortestPath(String str) {
        int x1 = 0, x2 = 0, y1 = 0, y2 = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'E' || str.charAt(i) == 'e') {
                x2++;
            } else if (str.charAt(i) == 'W' || str.charAt(i) == 'w') {
                x2--;
            } else if (str.charAt(i) == 'N' || str.charAt(i) == 'n') {
                y2++;
            } else if (str.charAt(i) == 'S' || str.charAt(i) == 's') {
                y2--;
            } else {
                continue;
            }
        }

        double path = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        return path;
    }

    // Shortest path with postion
    public static double shortestPath(String str, int firstPosition, int secondPosition) {
        int x2 = 0, y2 = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'E' || str.charAt(i) == 'e') {
                x2++;
            } else if (str.charAt(i) == 'W' || str.charAt(i) == 'w') {
                x2--;
            } else if (str.charAt(i) == 'N' || str.charAt(i) == 'n') {
                y2++;
            } else if (str.charAt(i) == 'S' || str.charAt(i) == 's') {
                y2--;
            } else {
                continue;
            }
        }
        return Math.sqrt((x2 - firstPosition) * (x2 - firstPosition) + (y2 - secondPosition) * (y2 - secondPosition));
    }

    public static void main(String[] args) {
        String str = "WNEENEabdkjflSENNN";

        System.out.println(shortestPath(str, 2, 0));
    }
}