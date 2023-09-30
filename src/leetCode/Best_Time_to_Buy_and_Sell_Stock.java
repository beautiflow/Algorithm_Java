package leetCode;

public class Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};

        int result = maxProfit(prices);
        System.out.println(result);
    }
    public static int maxProfit(int[] prices) {
        int profitMin = Integer.MAX_VALUE;
        int profitMax = 0;

        for(int i = 0; i < prices.length; i++) {
            if (prices[i] < profitMin) {
                profitMin = prices[i];
            }
            profitMax = Math.max(profitMax, prices[i] - profitMin);
        }
        return profitMax;
    }
}
