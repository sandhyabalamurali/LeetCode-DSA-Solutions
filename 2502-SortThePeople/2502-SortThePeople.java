// Last updated: 6/22/2025, 11:02:50 AM
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i=0;i<heights.length-1;i++){
            int max=i;
            for(int j=i+1;j<heights.length;j++){
                if(heights[j]>heights[max]){
                    max=j;
                }
            }
            int temp=heights[i];
            heights[i]=heights[max];
            heights[max]=temp;
            String temp_s=names[i];
            names[i]=names[max];
            names[max]=temp_s;
        }
        return names;
    }
}
