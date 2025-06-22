// Last updated: 6/22/2025, 11:04:59 AM
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
 *     }`
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
         if(root==null) return true;
         return trav(root.left,root.right);

        
    }
    public boolean trav(TreeNode Left,TreeNode Right){
        if(Left==null && Right==null){
            return true;
        }
        if(Left==null || Right==null){
            return false;
        }
        return Left.val==Right.val && trav(Left.left,Right.right) && trav(Left.right,Right.left);
    }
}