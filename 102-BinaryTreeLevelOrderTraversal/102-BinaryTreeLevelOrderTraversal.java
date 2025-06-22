// Last updated: 6/22/2025, 11:04:58 AM
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
import java.util.*;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result; // Fix: Handle null case correctly

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root); 

        while (!queue.isEmpty()) {
            int length = queue.size();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < length; i++) {
                TreeNode dequeuenode = queue.poll();
                list.add(dequeuenode.val);

                if (dequeuenode.left != null) queue.offer(dequeuenode.left);
                if (dequeuenode.right != null) queue.offer(dequeuenode.right);
            }
            result.add(list);
        }
        return result;
    }
}
