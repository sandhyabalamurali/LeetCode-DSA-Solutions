// Last updated: 6/22/2025, 11:03:48 AM
class Solution {
    public int subarraySum(int[] nums, int k) {
        // int n=nums.length;
        // // Map map=new HashMap();
        // Map<Integer, Integer> map = new HashMap<>();
        // int presum=0,count=0;
        // map.put(0,1);
        // for(int i=0;i<n;i++){
        //     presum+=nums[i];
        //     System.out.println(presum);
        //     int remove=presum-k;
        //     System.out.println(presum);
        //     count=count+map.getOrDefault(remove,0);
        //     System.out.println(count);
        //     map.put(presum, map.getOrDefault(presum, 0) + 1);
        //     System.out.println(map);
        // }
        // return count;

        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        map.put(0,1);
        int count = 0;
        int pre_sum = 0;
        for(int i=0;i<n;i++){
            pre_sum += nums[i];
            int value = pre_sum - k;
            if(map.containsKey(value)){
                count = count + map.get(value);
            }
            map.put(pre_sum,map.getOrDefault(pre_sum,0)+1);
        }
        return count;
    }
}