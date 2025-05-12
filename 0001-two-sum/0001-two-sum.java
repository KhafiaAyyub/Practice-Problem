class Solution {
    public int[] twoSum(int[] nums, int target) {
        // 3 5 7 4
        // 12
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int findMe = target - nums[i]; 
            if(map.containsKey(findMe)){
                return new int[] { i, map.get(findMe)} ;
            }
            map.put(nums[i],i); //first put then find
        }
        return null;
    }
}