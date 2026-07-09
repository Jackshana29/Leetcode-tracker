// Last updated: 09/07/2026, 09:31:03
class Solution {
    public int subtractProductAndSum(int n) {
        int sumOfDigits = 0;
        int productOfDigits = 1;

        while (n > 0) {
            int digit = n % 10;
            sumOfDigits += digit;
            productOfDigits *= digit;
            n /= 10;
        }

        return productOfDigits - sumOfDigits;
    }
}