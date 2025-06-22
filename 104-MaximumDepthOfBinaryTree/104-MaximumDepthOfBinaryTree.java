// Last updated: 6/22/2025, 11:04:56 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        return Depth(root,0);
    }
    public int Depth(TreeNode tptr,int depth){
        if(tptr==null){
            return depth;
        }
        depth=depth+1;
        int leftDepth = Depth(tptr.left, depth );
        int rightDepth = Depth(tptr.right, depth );
        return Math.max(leftDepth, rightDepth);
    }
}