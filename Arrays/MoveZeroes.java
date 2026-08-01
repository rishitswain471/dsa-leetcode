/*
LeetCode 283 - Move Zeroes

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public void moveZeroes(int[] nums) {

        int write = 0;

        for (int read = 0; read < nums.length; read++) {

            if (nums[read] != 0) {

                int temp = nums[write];
                nums[write] = nums[read];
                nums[read] = temp;

                write++;
            }
        }
    }
}
