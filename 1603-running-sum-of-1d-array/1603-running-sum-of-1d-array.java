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