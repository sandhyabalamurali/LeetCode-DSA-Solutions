class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // Arrays.sort(nums);
        ArrayList<Integer> ele=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            int count=0;
            if(ele.contains(nums[i])){
                continue;
            }
            for(int j=i;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>(n/3)){
                ele.add(nums[i]);
            }
        }
        return ele;

    }
}