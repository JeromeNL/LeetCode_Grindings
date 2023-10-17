package EasyProblems;

public class LC_121_BuySellStock {
    public int maxProfit(int[] prices) {
       int leftPointer = 0;
       int rightPointer = 1;
       int maxProfit = 0;

      while(rightPointer < prices.length){
          if(prices[rightPointer] < prices[leftPointer]){
              leftPointer = rightPointer;

          }
          else if(prices[rightPointer] - prices[leftPointer] > maxProfit){
              maxProfit = prices[rightPointer] - prices[leftPointer];

          }
          rightPointer++;
      }
      return maxProfit;
    }
}
