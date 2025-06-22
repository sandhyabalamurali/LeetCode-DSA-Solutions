// Last updated: 6/22/2025, 11:02:55 AM
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        // ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                pos.add(nums[i]);
            }
            else if(nums[i]<0){
                neg.add(nums[i]);
            }
        }
        int[] res = new int[n];
        int p=0,ne=0,i=0;
        while(p<pos.size() && ne<neg.size()){
            res[i++]=pos.get(p++);
            res[i++]=neg.get(ne++);
        }
        return res;

    }
}