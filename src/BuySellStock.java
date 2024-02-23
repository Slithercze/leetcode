public class BuySellStock {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            // If the current price is less than the minimum price we've seen so far,
            // update the minimum price.
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                // Otherwise, calculate the potential profit if we sell on the current day,
                // and update the maxProfit if necessary.
                int currentProfit = prices[i] - minPrice;
                if (currentProfit > maxProfit) {
                    maxProfit = currentProfit;
                }
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(maxProfit(new int[]{7, 6, 4, 3, 1}));
        System.out.println(maxProfit(new int[]{2, 4, 1}));
        System.out.println(maxProfit(new int[]{2, 1, 4}));
        System.out.println("====");
        System.out.println(9%3);
        System.out.println(-2%5);
    }
}
