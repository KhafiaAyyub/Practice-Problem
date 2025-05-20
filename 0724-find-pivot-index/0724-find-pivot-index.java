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