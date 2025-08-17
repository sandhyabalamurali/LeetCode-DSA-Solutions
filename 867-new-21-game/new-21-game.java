class Solution {
    public double new21Game(int n, int k, int maxPts) {
        if(k==0) return 1;
        double[] dp=new double[n+1];
        dp[0]=1;
        double win=1;
        //sliding window 
        for(int i=1;i<=n;i++){
            dp[i]=win/maxPts;
            if(i<k){
                win+=dp[i]; //increment to reach the goal
            }
            if(i>=maxPts && i-maxPts<k){  //decrement when u have greater than maxpoints
                win-=dp[i-maxPts];
            }
        }
        double ans=0;
        for(int i=k;i<=n;i++){
            ans+=dp[i];
        }
        return ans;
    }
}