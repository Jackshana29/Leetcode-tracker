// Last updated: 09/07/2026, 09:31:15
class Solution {
    /**
     * Determines if Alice wins the Divisor Game.
     * Alice wins if and only if the initial number n is even.
     *
     * @param n The initial number on the chalkboard.
     * @return true if Alice wins, false otherwise.
     */
    public boolean divisorGame(int n) {
       
        return n % 2 == 0;
    }
}