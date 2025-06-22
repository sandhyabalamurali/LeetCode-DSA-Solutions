// Last updated: 6/22/2025, 11:04:19 AM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){ //i=0
            int cnt=0;   // 0
            if(list.contains(nums[i])){ //no
                continue;
            }
            // j=0,
            for(int j=i;j<n;j++){   
                if(nums[i]==nums[j]){ 
                    // cnt=1
                    cnt++;  
                }
            }
            if(cnt>(n/3)){
                list.add(nums[i]);
            }
            // if (list.size() == 2) break;
        }
        return list;

    }
}