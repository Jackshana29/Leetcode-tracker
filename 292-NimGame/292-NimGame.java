// Last updated: 09/07/2026, 09:31:49
class Solution {
    public boolean canWinNim(int n) {
        // You can win if the number of stones is not a multiple of 4.
        // If n is a multiple of 4, your opponent can always play to leave you
        // with another multiple of 4, eventually leading you to 4 stones,
        // which is a losing position.
        return (n % 4 != 0);
    }
}