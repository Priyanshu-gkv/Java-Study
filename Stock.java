public class Stock {

    public static void stockBuySell(int num[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < num.length; i++) {
            if (buyPrice < num[i]) {
                int profit = num[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = num[i];
            }
        }
        System.out.println(maxProfit);
    }

    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        stockBuySell(arr);
    }
}
