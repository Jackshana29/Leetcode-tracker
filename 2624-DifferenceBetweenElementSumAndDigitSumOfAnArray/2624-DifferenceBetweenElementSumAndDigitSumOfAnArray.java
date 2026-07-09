// Last updated: 09/07/2026, 09:30:48
class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0,sum1=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(nums[i]!=0){
                 sum1+=nums[i]%10;
                 nums[i]/=10;
            }
        }return sum-sum1;
    }
}