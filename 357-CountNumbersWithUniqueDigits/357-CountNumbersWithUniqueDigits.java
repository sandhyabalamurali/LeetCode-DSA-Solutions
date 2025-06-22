// Last updated: 6/22/2025, 11:04:02 AM
class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0)
        {
            return 1;
        }
        if(n==1)
        {
            return 10;
        }
        int count=10,uni_dig=9,ava_dig=9;
        for(int i=2;i<=n;i++)
        {
            uni_dig*=ava_dig;
            count+=uni_dig;
            ava_dig--;
        }
        return count;
   
   
    }
}