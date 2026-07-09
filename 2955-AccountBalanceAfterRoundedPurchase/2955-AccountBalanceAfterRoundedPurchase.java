// Last updated: 09/07/2026, 09:30:29
class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        // Round purchaseAmount to the nearest multiple of 10
        int roundedAmount = (purchaseAmount + 5) / 10 * 10;
        
        // Calculate the final balance
        int finalBalance = 100 - roundedAmount;
        
        return finalBalance;
    }
}