
# Using Map
//key value pair
//1.put  O(n) 
//2.map.containskey
//3.search the difference of the target in an array
    //Test1: 3 5 7 4      12
    //Test2: 5 3 4 7 9    10


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

