// Last updated: 09/07/2026, 09:30:40
class Solution {
    public int numberOfCuts(int n) {
        if (n == 1) {
            return 0;
        } else if (n % 2 == 0) {
            return n / 2;
        } else {
            return n;
        }
    }
}