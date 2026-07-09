// Last updated: 09/07/2026, 09:31:26
class Solution {
    public boolean judgeCircle(String moves) {
        int[] freq = new int[26];
        for(char c:moves.toCharArray()){
            freq[c-'A']++;
        }

        if(freq['D'-'A']==freq['U'-'A'] && freq['L'-'A']==freq['R'-'A'])
            return true;

        return false;
    }
}