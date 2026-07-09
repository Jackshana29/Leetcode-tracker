// Last updated: 09/07/2026, 09:30:56
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[]=new int[nums.length];
        int st=0;
        int m=n;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
             arr[i]=nums[st];
             st++;
            }
             else{
             arr[i]=nums[m];
            m++;
            }
        }
        return arr;
    }
}