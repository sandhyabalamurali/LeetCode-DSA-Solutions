// Last updated: 6/22/2025, 11:05:19 AM
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int m=matrix.length; //row
        int n=matrix[0].length; //col
        int top=0,left=0,right=n-1,bottom=m-1;
        // left->right
        while (top <= bottom && left <= right) {
            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
            }
            top+=1;
            //right->bottom
            for(int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);
            }
            right-=1;
            // right->left
            if(top<=bottom){
            for(int i=right;i>=left;i--){
                ans.add(matrix[bottom][i]);
            }
            bottom--;
            }
            // bottom->top
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}