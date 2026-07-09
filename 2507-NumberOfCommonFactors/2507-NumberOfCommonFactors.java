// Last updated: 09/07/2026, 09:30:43
class Solution {
    public int commonFactors(int a, int b) {
        int count=0;
        int lim=Math.min(a,b);
        for(int i=1;i<=lim;i++){
            if(a%i==0 && b%i==0){
                count++;
            }
        }
        return count;
    }
}