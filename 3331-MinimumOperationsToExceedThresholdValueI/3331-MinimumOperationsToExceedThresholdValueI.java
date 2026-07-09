// Last updated: 09/07/2026, 09:30:14
class Solution {
    public int minOperations(int[] nums, int k) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<k){
                c++;
            } }
        return c;
    }
}