//TWO SUM
# Brute Force
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                    if(nums[i] + nums[j] == target){
                        return new int[] {i,j};
                    }
            }
        }
        return null;
    }
}

//Best Time to Buy and Sell Stock

//7,1,5,3,6,4
//1,2,3,4,5,6 //6-1=5 
//max-min //min - buy , max - sell
class Solution {
    public int maxProfit(int[] prices) {
       int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
       for(int i=0;i<prices.length;i++){
        if(prices[i] <minPrice){
            minPrice = prices[i];
        } else if(prices[i] - minPrice > maxProfit){
            maxProfit = prices[i] - minPrice;
        }
       }
       return maxProfit; 
        
    }
}

