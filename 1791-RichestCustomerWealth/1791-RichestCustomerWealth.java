// Last updated: 6/22/2025, 11:03:04 AM
class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0,i,j,temp=0;

        for(i=0;i<accounts.length;i++){
            for(j=0;j<accounts[0].length;j++){
                sum+=accounts[i][j];
            }
            temp=Math.max(sum,temp);
            sum=0;
            
        }
        return temp;
        
    }
}