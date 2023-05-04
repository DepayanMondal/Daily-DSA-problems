package homeworks;

public class Buy_and_sell_stocks {
    public static void main(String[] args) {

        int[] prices;
        prices = new int[]{3,2,7,11,6};
        int min_price = Integer.MAX_VALUE;
        int max_profit = 0;

        for(int i=0; i<prices.length; i++) {
            if(prices[i] < min_price) {
                min_price = prices[i];
            }
            else if(prices[i] - min_price > max_profit) {
                max_profit = prices[i] - min_price;
            }
        }
        System.out.println("Maximum profit: " + max_profit);
    }
}
