// Last updated: 6/22/2025, 11:04:42 AM
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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        postorder(root,list);
        return list;
        
    }
    public void postorder(TreeNode tptr,List<Integer> list){
        if(tptr==null){
            return;
        }
        postorder(tptr.left,list);
        postorder(tptr.right,list);
        list.add(tptr.val);
    }
}