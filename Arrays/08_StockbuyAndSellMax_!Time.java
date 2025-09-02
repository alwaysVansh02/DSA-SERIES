//Given an array prices[] of length n, representing the prices of the stocks on
//different days. The task is to find the maximum profit possible by buying
//and selling the stocks on different days when at most one transaction is
//allowed. Here one transaction means 1 buy + 1 Sell. If it is not possible to
//make a profit then return O.
//        Note: Stock must be bought before being sold.
//        Examples:
//Input: prices[] —
//Output: 8
//Explanation: You
//sell it on day 5
//        - [7, 10, 1, 3, 6, 9, 2]
//can buy the
//at price = 9.
//stock on day 2 at price = 1 and
//Hence, the profit is 8.
package ArrayGFG;

public class GFGStockBuyAndSellMaxOneTrans {
    public int maximumProfit(int prices[]) {
// Code here
        int n = prices.length;
        if (n == 0) return 0;
        int minprice = prices[0];
        int maxprofit = 0;
        for (int i = 1; i < n; i++) {
            int profit = prices[i] - minprice;
            if (profit > maxprofit) {
                maxprofit = profit;
            }
            if (prices[i] < minprice) {
                minprice = prices[i];
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        GFGStockBuyAndSellMaxOneTrans obj = new GFGStockBuyAndSellMaxOneTrans();
        int[] prices = { 100, 180, 200,220, 330, 40, 550};
        System.out.println( "maximum profit is:" + obj.maximumProfit(prices));
    }
}
