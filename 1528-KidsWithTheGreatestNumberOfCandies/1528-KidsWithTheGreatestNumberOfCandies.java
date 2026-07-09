// Last updated: 09/07/2026, 09:30:58
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int maxCandies =0;
        for(int candy : candies){
            maxCandies = Math.max(candy,maxCandies);
        }
        List<Boolean> result = new ArrayList<>();
        for(int candy : candies){
            result.add(candy + extraCandies >= maxCandies);
        }
        return result;
}
}