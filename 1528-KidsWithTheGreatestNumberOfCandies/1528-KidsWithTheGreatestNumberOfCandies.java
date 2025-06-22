// Last updated: 6/22/2025, 11:03:11 AM
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result=new ArrayList<>();
        int max=0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
               int candy=candies[i]+extraCandies;
               if(candy>=max){
                result.add(true);
               }
               else{
                result.add(false);
               }
        }
        return result;
    }
}