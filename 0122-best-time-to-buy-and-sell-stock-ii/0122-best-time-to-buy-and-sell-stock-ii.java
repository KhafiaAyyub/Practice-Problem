class Solution {
    public int maxProfit(int[] prices) {
        //TC = O(n) - one loop
        //SP = O(1) - no extra space
        int max_p = 0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i]<prices[i+1]){
                max_p += prices[i+1]-prices[i];
            }
        }
        return max_p;
    }
}