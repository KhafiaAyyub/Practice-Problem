class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         //nums1 - 1 2 3 0 0 0  = m
         //             i    k
         //nums2 - 2 5 6        = n
         //            j
         //merge in nums1 = 1 2 2 3 5 6 - sorted
         //we will put larger elements in nums1 end
         int i = m-1;
         int j = n-1;
         int k = m+n-1;

         while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                k--;
                i--;
            } 
            else {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
         }

         
    }
}