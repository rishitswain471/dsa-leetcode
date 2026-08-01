/*
LeetCode 26 - Remove Duplicates from Sorted Array

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int removeDuplicates(int[] nums) {

        int write = 1;

        for (int read = 1; read < nums.length; read++) {

            if (nums[read] != nums[write - 1]) {

                nums[write] = nums[read];
                write++;
            }
        }

        return write;
    }
}
