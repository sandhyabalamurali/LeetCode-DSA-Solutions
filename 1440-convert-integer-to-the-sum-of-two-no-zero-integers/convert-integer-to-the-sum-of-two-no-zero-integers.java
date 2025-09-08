class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int i=0;i<n;i++){
            int res=n-i;
            int temp=res;
            int pos=i;
        if(!String.valueOf(temp).contains("0") && !String.valueOf(pos).contains("0")){
            return new int[]{i,res};
        }
        }
        return new int[]{-1,-1};
    }
}