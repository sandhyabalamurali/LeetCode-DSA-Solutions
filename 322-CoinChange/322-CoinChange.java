// Last updated: 6/22/2025, 11:04:07 AM
class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] min=new int[amount+1];
        Arrays.fill(min,amount+1);
        min[0]=0;
        for(int i=1;i<=amount;i++){
            for(int c:coins){
                if(i>=c){
                    min[i]=Math.min(min[i],min[i-c]+1);
                }
            }
        }
        return min[amount]>amount?-1:min[amount];
    }
}