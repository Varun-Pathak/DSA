package Arrays;

import java.util.HashSet;

public class MaxProfit {

    public static void main(String[] args) {
        int[] stockPrices = {11,6,3,1,100};
        System.out.println(findMaxProfit(stockPrices));
    }

    private static int findMaxProfit(int[] stockPrices) {

        int leastPrice = stockPrices[0];
        int maxProfit = 0;
        for(int i=1; i<stockPrices.length; i++){
            leastPrice = Math.min(leastPrice, stockPrices[i]);
            maxProfit = Math.max(maxProfit, stockPrices[i]-leastPrice);
        }
        return maxProfit;
    }
}
