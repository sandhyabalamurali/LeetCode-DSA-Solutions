// Last updated: 6/22/2025, 11:04:44 AM
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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        preorder(root,list);
        return list;
    }
    public void preorder(TreeNode tptr,List<Integer> list){
        if(tptr==null){
            return;
        }
        list.add(tptr.val);
        preorder(tptr.left,list);
        preorder(tptr.right,list);
    }
}