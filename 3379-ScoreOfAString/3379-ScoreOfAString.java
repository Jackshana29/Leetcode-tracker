// Last updated: 09/07/2026, 09:30:17
class Solution {
    public int scoreOfString(String s) {
        int score = 0;

        for (int i = 0; i < s.length() - 1; i++)
            score += Math.abs(s.charAt(i) - s.charAt(i + 1));

        return score;
    }
}