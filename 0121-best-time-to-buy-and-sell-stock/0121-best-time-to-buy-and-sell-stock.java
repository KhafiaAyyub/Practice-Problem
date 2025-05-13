//7,1,5,3,6,4
//1,2,3,4,5,6 //6-1=5 
//time and space complexity - O(n)
class Solution {
    public int maxProfit(int[] prices) {
       int minSoFar = prices[0];
        int maxProfit = 0;
       for(int i=0;i<prices.length;i++){
        minSoFar = Math.min(minSoFar,prices[i]);
        int profit = prices[i] - minSoFar;
        maxProfit = Math.max(maxProfit,profit);
       }
      return maxProfit;  
    }
}