// Last updated: 6/22/2025, 11:03:23 AM
class Solution {
public:
    // int fib(int n) {
    //     if(n<=1) return n;
    //     return fib(n-1)+fib(n-2);
    // }
    int fib(int n){
        if(n<=1) return n;
        int prev1=1;
        int prev2=0;
        int cur;
        for(int i=2;i<=n;i++)
        {
            cur=prev1+prev2;
            prev2=prev1;
            prev1=cur;

        }
        return cur;

    }
};