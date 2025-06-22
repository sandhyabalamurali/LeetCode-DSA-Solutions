// Last updated: 6/22/2025, 11:05:02 AM
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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root,list);
        return list;
        
    }
    public void inorder(TreeNode tptr, List<Integer> list){
        if(tptr==null){
            return;
        }
        inorder(tptr.left,list);
        list.add(tptr.val);
        inorder(tptr.right,list);

    }
}