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
    HashMap<Integer,Integer> map=new HashMap<>();
    int index=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return helper(preorder,0,inorder.length-1);
    }
    public TreeNode helper(int[] preorder,int left,int right){
        if(right<left){
            return null;
        }
        int root=preorder[index++];
        TreeNode value=new TreeNode(root);
        value.left=helper(preorder,left,map.get(root)-1);
        value.right=helper(preorder,map.get(root)+1,right);
        return value;
    }

    
}