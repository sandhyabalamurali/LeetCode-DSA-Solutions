// Last updated: 6/22/2025, 11:05:10 AM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0,l=0,h=matrix[0].length-1,n=matrix.length;
        while(i<n){
            while(l<=h){
                int mid=(l+h)/2;
                if(matrix[i][mid]==target){
                    return true;
                }
                else if (matrix[i][mid]<target){
                    l=mid+1;
                }
                else{
                  h=mid-1;
                }
            }
            i++;
            l=0;
            h=matrix[0].length-1;

        }
        return false;
    }
}