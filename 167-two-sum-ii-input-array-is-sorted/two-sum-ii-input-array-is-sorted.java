class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low=0;
        int high=numbers.length-1;
        while(low<=high){
            if(target==numbers[low]+numbers[high]){
                return new int[]{low+1,high+1};
            }
            else if (target>numbers[low]+numbers[high]){
                low++;
            }
            else{
                high--;
            }
        }
        return new int[]{-1,-1};
    }
}