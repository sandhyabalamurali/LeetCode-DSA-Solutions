class Solution {
    final int MOD = 1_000_000_007;
    public int numberOfWays(int n, int x) {
        long[] dp=new long[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            int temp=(int)Math.pow(i,x);
            if(temp>n){
                break;
            }
            for(int j=n;j>=temp;j--){
                dp[j]=(dp[j]+dp[j-temp]) % MOD;
            }
        }
        return (int) dp[n];
    }
}