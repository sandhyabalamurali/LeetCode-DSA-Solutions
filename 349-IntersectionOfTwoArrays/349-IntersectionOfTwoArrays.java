// Last updated: 6/22/2025, 11:04:03 AM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) { //1 2 2 1
        HashSet<Integer> set=new HashSet<Integer>();
        ArrayList<Integer> list=new ArrayList<Integer>();
        int i,val;
        for(i=0;i<nums1.length;i++){
            val=nums1[i];
            set.add(val); //1 2
        }
        for(i=0;i<nums2.length;i++){
            val=nums2[i];
            if(set.contains(val)==true){ 
                list.add(val); //2
                set.remove(val);
            }
        }
        int[] res=new int[list.size()];
        for(i=0;i<res.length;i++){
            res[i]=list.get(i);
        }
        return res;
        
        
    }
}