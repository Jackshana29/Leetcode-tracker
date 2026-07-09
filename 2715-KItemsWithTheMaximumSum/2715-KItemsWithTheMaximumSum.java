// Last updated: 09/07/2026, 09:30:34
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int sum = 0;

        // Take as many ones as possible
        int takeOnes = Math.min(numOnes, k);
        sum += takeOnes;
        k -= takeOnes;

        // If k is still > 0, take zeros. This doesn't change the sum.
        int takeZeros = Math.min(numZeros, k);
        k -= takeZeros;
        
        // If k is still > 0, take negative ones.
        if (k > 0) {
            sum -= k;
        }

        return sum;
    }
}