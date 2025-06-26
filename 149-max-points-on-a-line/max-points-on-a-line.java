class Solution {
    public int maxPoints(int[][] arr) {
        int max=1;
        for(int i=0;i<arr.length;i++){
            HashMap<Double,Integer> res=new HashMap<>();
            for(int j=0;j<arr.length;j++){
                if(i==j){
                    continue;
                }
                double slope=(arr[j][0]-arr[i][0])!=0?(arr[j][1]-arr[i][1]*1.0)/(arr[j][0]-arr[i][0]):Integer.MAX_VALUE;
                res.put(slope,res.getOrDefault(slope,1)+1);
                max=Math.max(max,res.get(slope));
            }
        }
        return max;
    }
}