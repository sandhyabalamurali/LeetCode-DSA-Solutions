// Last updated: 6/22/2025, 11:05:21 AM
class Solution {
    public double myPow(double x, int n) {
        long exp=n;
        double res=1;
        if(exp<0){
            x=1/x;
            exp=-exp;
        }
        while(exp>0){
            if(exp==0){
                return 1;
            }
            if(exp%2==1){
                res*=x;
            }
            x*=x;
            exp/=2;
        }
        return res;
    }
}