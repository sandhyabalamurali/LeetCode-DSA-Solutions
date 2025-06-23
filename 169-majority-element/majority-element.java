class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        System.out.print(map);
        int m=-1;
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()>nums.length/2){
                m=e.getKey();
                break;
            }
        }
        return m;
    }
}