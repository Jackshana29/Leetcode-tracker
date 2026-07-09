// Last updated: 09/07/2026, 09:31:02
class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        
        while (num > 0) {
            if (num % 2 == 0) {
                // If num is even, divide by 2
                num /= 2;
            } else {
                // If num is odd, subtract 1
                num -= 1;
            }
            steps++;
        }
        
        return steps;
    }
}