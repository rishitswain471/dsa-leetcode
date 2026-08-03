/*
LeetCode 11 - Container With Most Water

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;

        int maxArea = 0;

        while (left < right) {

            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int area = width * minHeight;

            if (area > maxArea) {
                maxArea = area;
            }

            if (height[left] < height[right]) {
                left++;
            }

            else {
                right--;
            }
        }

        return maxArea;
    }
}
