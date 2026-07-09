// Last updated: 09/07/2026, 09:30:42
class Solution {
    public int pivotInteger(int n) {
        int totalSum = n * (n + 1) / 2;
        int x = (int) Math.sqrt(totalSum);

        if (x * x == totalSum) {
            return x;
        } else {
            return -1;
        }
    }
}