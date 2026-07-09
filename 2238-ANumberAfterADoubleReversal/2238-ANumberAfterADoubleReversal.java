// Last updated: 09/07/2026, 09:30:46
class Solution {
    /**
     * Reverses an integer, dropping leading zeros in the reversed number.
     * For example, reverse(123) returns 321.
     * reverse(12300) returns 321.
     * reverse(0) returns 0.
     *
     * @param n The integer to reverse.
     * @return The reversed integer.
     */
    private int reverse(int n) {
        int reversedNum = 0;
        // Handle the case where n is 0 separately, or the loop will not execute
        // and it will correctly return 0.
        if (n == 0) {
            return 0;
        }

        while (n > 0) {
            int digit = n % 10;
            reversedNum = reversedNum * 10 + digit;
            n /= 10;
        }
        return reversedNum;
    }

    public boolean isSameAfterReversals(int num) {
        // Step 1: Reverse num to get reversed1
        int reversed1 = reverse(num);

        // Step 2: Reverse reversed1 to get reversed2
        int reversed2 = reverse(reversed1);

        // Step 3: Check if reversed2 equals num
        return reversed2 == num;
    }
}