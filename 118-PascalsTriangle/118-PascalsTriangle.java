// Last updated: 6/22/2025, 11:04:54 AM
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> temp=new ArrayList<>();
            for(int j=0;j<=i;j++){
                temp.add(ncr(i,j));
            }
            ans.add(temp);
        }
        
        return ans;
    }
    public static int ncr(int r,int c){
        int res=1;
        for(int i=1;i<=c;i++){
            res=res*(r-i+1)/i;
        }
        return res;
    }

}
