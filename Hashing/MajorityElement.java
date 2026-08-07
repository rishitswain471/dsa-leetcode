/*
LeetCode 169 - Majority Element

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.HashMap;

class Solution {

    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for (int num : nums) {

            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) > n / 2) {
                return num;
            }
        }

        return -1;
    }
}
