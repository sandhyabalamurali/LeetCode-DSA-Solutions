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
    int cameras = 0;

    public int minCameraCover(TreeNode root) {
        // If root needs a camera, place it
        if (dfs(root) == 0) {
            cameras++;
        }
        return cameras;
    }

    // Return state:
    // 0 - Needs Camera
    // 1 - Has Camera
    // 2 - Covered
    private int dfs(TreeNode node) {
        if (node == null) return 2; // Null nodes are considered covered

        int left = dfs(node.left);
        int right = dfs(node.right);

        if (left == 0 || right == 0) {
            // If any child needs a camera, place a camera here
            cameras++;
            return 1; // This node has a camera
        }

        if (left == 1 || right == 1) {
            // If any child has a camera, this node is covered
            return 2; // Covered
        }

        return 0; // This node needs a camera
    }
}