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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<TreeNode> sortedNodes = new ArrayList<TreeNode>();
        dfs(root,sortedNodes);
        return sortedNodes.get(k-1).val;
    }

    public void dfs(TreeNode node, ArrayList list){
        if(node == null) return;
        dfs(node.left,list);
        list.add(node);
        dfs(node.right,list);
    }
}
