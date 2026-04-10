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
    public int rob(TreeNode root) {
    int res[]=dp(root);
    return Math.max(res[0],res[1]);
    }
    private int[] dp(TreeNode node){
        if(node==null) return new int[]{0,0};
        int[] left=dp(node.left);
        int[] right=dp(node.right);
        int rob=node.val+left[1]+right[1];
        int notrob=Math.max(left[0],left[1])+Math.max(right[0],right[1]);
        return new int[]{rob,notrob};
    }
}