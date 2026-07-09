// Last updated: 09/07/2026, 09:32:59
class Solution {
    public int reverse(int x) {
        long reversed = 0;
        int temp = x;

        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) reversed;
    }
}