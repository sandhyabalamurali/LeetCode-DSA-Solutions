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
    int index=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return helper(preorder,0,inorder.length-1,map);
    }
    public TreeNode helper(int[] preorder,int left,int right,HashMap<Integer,Integer> map){
        if(right<left){
            return null;
        }
        int root=preorder[index++];
        TreeNode value=new TreeNode(root);
        value.left=helper(preorder,left,map.get(root)-1,map);
        value.right=helper(preorder,map.get(root)+1,right,map);
        return value;
    }

    
}