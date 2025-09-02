// src/ArrayGFG/GFGStockBuyAndSell.java
package ArrayGFG;

public class GFGStockBuyAndSell {

    public int maximumProfit(int[] prices) {
        int n = prices.length;
        int totalProfit = 0;
        for (int i = 1; i < n; i++) {
            if (prices[i] > prices[i - 1]) {
                int profitToday = prices[i] - prices[i - 1];
                totalProfit += profitToday;
                System.out.println("Buy stock at: " + prices[i - 1] +
                        ", Sell stock at: " + prices[i] +
                        " => Profit: " + profitToday);
            } else {
                System.out.println("No transaction on day " + i);
            }
        }
        return totalProfit;
    }

    public static void main(String[] args) {
        GFGStockBuyAndSell obj = new GFGStockBuyAndSell();
        int[] prices = {100, 180, 260, 310, 40, 535, 695};
        System.out.println("Total Profit: " + obj.maximumProfit(prices));
    }
}
