// Last updated: 09/07/2026, 09:32:48
class Solution {
    public int search(int[] arr, int target) {
        int n=arr.length-1;
        int s=0,e=n;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target) return mid;
//  find which part is sorted
//  condition for left part sorted
            if(arr[s]<=arr[mid]){
                // ensure the target is in between start & mid
                if(arr[s]<=target&&target<=arr[mid]) e=mid-1;
                //  else target in right hand side so search right
                else s=mid+1;

            }
//  if left part not sorted order , definatly the right part is sorted
            else{
                //  ensure the target is right in by part or right side of array
                if(arr[mid]<=target&&target<=arr[e]) s=mid+1;
                // else target may be in left 
                else e=mid-1;
            }
        }
    //  if element not found return -1
        return -1;
    }
}