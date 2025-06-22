// Last updated: 6/22/2025, 11:03:26 AM
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        // ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                even.add(nums[i]);
            }
            else if(nums[i]%2!=0){
                odd.add(nums[i]);
            }
        }
        int[] res = new int[n];
        int e=0,o=0,i=0;
        while(e<even.size() && o<odd.size()){
            res[i++]=even.get(e++);
            res[i++]=odd.get(o++);
        }
        return res;
    }
}