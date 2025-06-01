//Two Sum
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
//sol1:
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

//sol2:
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

//Merge Sorted Array
//Brute force
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
//using bubble sort
        int total = m + n;
        for (int i = 0; i < total - 1; i++) {
            for (int j = 0; j < total - i - 1; j++) {
                if (nums1[j] > nums1[j + 1]) {
                    // Swap nums1[j] and nums1[j + 1]
                    int temp = nums1[j];
                    nums1[j] = nums1[j + 1];
                    nums1[j + 1] = temp;
                }
            }
        }
    }
}

//Move Zeros
//Brute Force

//Best Time to Buy and Sell Stock II
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


//Running Sum of 1d Array
class Solution {
    public int[] runningSum(int[] nums) {
    //TC - O(n)
    //SC - O(1)        

        for(int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1];

        }
        return nums;
    }
}

//Find Pivot Index
class Solution {
    public int pivotIndex(int[] nums) {
        //TC - O(n)
        //SP - O(1)
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int ls=0;
        for(int i=0;i<nums.length;i++){
            if(ls == sum-ls-nums[i]){
                return i;
            }
            ls+=nums[i];
        }
          return -1;
    }
}


//Majority Element
1.Using hashmap this will increase SP
2.Moore's Voting Algorithm
    step1: Find the majority element to majority element
    step: Confirm weather it is majority element

//Fibonacci Number

