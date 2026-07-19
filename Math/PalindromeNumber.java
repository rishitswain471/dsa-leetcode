/*
LeetCode 9 - Palindrome Number

Time Complexity: O(log n)
Space Complexity: O(1)
*/
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        int original = x;
        long rev = 0;

        while (x != 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x /= 10;
        }

        return original == rev;
    }
}
