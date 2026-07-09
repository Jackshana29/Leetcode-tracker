// Last updated: 09/07/2026, 09:30:35
class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long concatenationValue = 0;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            if (left == right) {
                // If there's only one element left
                concatenationValue += nums[left];
            } else {
                // Concatenate the first and last elements
                String firstStr = String.valueOf(nums[left]);
                String lastStr = String.valueOf(nums[right]);
                String concatenatedStr = firstStr + lastStr;
                concatenationValue += Long.parseLong(concatenatedStr);
            }
            
            left++;
            right--;
        }

        return concatenationValue;
    }
}