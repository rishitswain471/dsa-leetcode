/*
LeetCode 53 - Maximum Subarray

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int maxSubArray(int[] nums) {
        int currentsum=0;
        int maxsum= Integer.MIN_VALUE;
        for(int num:nums){
               currentsum+=num;
               maxsum= Math.max(currentsum, maxsum);
               if(currentsum<0){
                currentsum=0;
               }
        }
        return maxsum;
    }
}
