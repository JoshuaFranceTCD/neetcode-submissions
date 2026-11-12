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
    public int result = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {

        dfs(root);
        return result;
    }

    // find the maximum path from a node. If it is negative the maximum path is ignorign the root
    // return 0
    private int getMax(TreeNode node){
        if(node == null) return 0;
        int left = getMax(node.left);
        int right = getMax(node.right);
        int path = node.val + Math.max(left, right);        
        return Math.max(0,path);
    }
    // find the maximum path from the right and left nodes
    // the maximum path of the central node is either
    //  a) the central node itself (both right and left lead to negatives)
    //  b) the central node and one of the paths
    //  c) one of the paths
    //  all negative paths return 0 from the getMax function, so combining all 3 scenarios
    //      will give us the maximum path
    public void dfs(TreeNode node){
        if(node == null) return;
        int right = getMax(node.right);
        int left = getMax(node.left);
        int combined = right + left + node.val;
        result = Math.max(result,combined);
        dfs(node.left);
        dfs(node.right);
        // return max (node itself, the right node path, the left node path, the combined path;)



    }
}

