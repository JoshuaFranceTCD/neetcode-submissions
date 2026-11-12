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
        if(root == null) return 0;
        return maxDepth(root, 1);

    }
    public int maxDepth(TreeNode node, int count){
        
        if(node.left == null && node.right == null){
            return count;
        }
        int countLeft = count;
        if(node.left != null){
            countLeft = maxDepth(node.left,count + 1);
        }
        int countRight = count;
        if(node.right != null){
            countRight = maxDepth(node.right,count+1);
        }
        return Math.max(countRight,countLeft);

    }
}