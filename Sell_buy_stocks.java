public class Sell_buy_stocks {

    public static int buySellStocks(int prices[])
    {
        int buyPrice= Integer.MAX_VALUE;
        int maxProfit= 0;

        for(int i=0;i<prices.length;i++)
        {
            if(buyPrice< prices[i])
            {
                int profit= prices[i] - buyPrice;
                maxProfit= Math.max(profit,maxProfit);

            }
            else {
                buyPrice= prices[i];

            }
        }
        return maxProfit;
    }
    public static void main(String args[])
    {
        int prices[]={7,1,5,3,6,4};
        int arr[]={17, 20 ,11, 9 ,12 ,6};
        System.out.println(buySellStocks(prices));
        System.out.println(buySellStocks(arr));
    }
}
