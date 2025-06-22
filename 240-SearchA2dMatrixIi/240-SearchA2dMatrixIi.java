// Last updated: 6/22/2025, 11:04:14 AM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l=0,h=matrix[0].length-1,n=matrix.length;

            while(h>=0 && l<=n-1){
                int mid=(l+h)/2;
                if(matrix[l][h]==target){
                    return true;
                }
                else if(matrix[l][h]>target){
                    h--;
                }
                else{
                    l++;
                }
            }
            return false;
    }

}