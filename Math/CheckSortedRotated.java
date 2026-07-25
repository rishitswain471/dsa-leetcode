/*
LeetCode 1752 - Check if Array Is Sorted and Rotated

Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public boolean check(int[] nums) {
        int breaks = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                breaks++;
            }
        }

        return breaks <= 1;
    }
}
