class Solution {
    public int maxProfit(int[] prices) {
       int buyprice = Integer.MAX_VALUE; // this is the price when it is the lowest, just set it to a very high value.
       int max_profit = 0; // initially set the maximum profit as zero.

       for(int i = 0; i<prices.length; i++){
          // check a cross the entire price array.

          if(buyprice < prices[i]){ // the profit case!
            int profit = prices[i] - buyprice; // calculate the profit for that iteration, till that point
            max_profit = Math.max(profit, max_profit);// the global profit, across the entire set of data
         }
         else{
            buyprice = prices[i];// if the buyprice is more than the the price at that day, then set the price for that iteration
         }
                                 // buyprice will be the lowest term in the array!
     }

// the if part will calculate the maximum possible profit whereas the else part will set the buyprice the lowest 

       return max_profit;
    }
}