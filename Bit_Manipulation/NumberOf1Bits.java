/*
LeetCode 191 - Number of 1 Bits

Time Complexity: O(number of set bits)
Space Complexity: O(1)
*/

public class NumberOfOneBits {

    public static void main(String[] args) {

        int n = 11;
        int count = 0;

        while (n != 0) {
            n = n & (n - 1);
            count++;
        }

        System.out.println("Number of 1 Bits: " + count);
    }
}
