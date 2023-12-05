package Q3;
public class Q3 {
    public int maximumProfit(int[] prices) {
        int min_price = Integer.MAX_VALUE;
        int max_profit = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min_price){
                min_price = prices[i];
            }else if(prices[i] - min_price > max_profit){
                max_profit = prices[i] - min_price;
            }
        }
        return max_profit;
    }

    public static void main(String[] args) {
        Q3 q3 = new Q3();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(q3.maximumProfit(prices));
        prices = new int[]{7,6,4,3,1};
        System.out.println(q3.maximumProfit(prices));
    }
}
