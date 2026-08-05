/*
LeetCode 268 - Missing Number

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class MissingNumber {

    public static void main(String[] args) {

        int[] nums = {3, 0, 1};

        int xor = 0;

        for (int i = 0; i <= nums.length; i++) {
            xor ^= i;
        }

        for (int num : nums) {
            xor ^= num;
        }

        System.out.println("Missing Number: " + xor);
    }
}
