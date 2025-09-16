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
    public int h(TreeNode root){
        if(root==null) return 0;
        return Math.max(h(root.left)+1,h(root.right)+1);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int h1c=h(root.right);
        int h2c=h(root.left);
        int d1=diameterOfBinaryTree(root.left);
        int d2=diameterOfBinaryTree(root.right);
        return Math.max(Math.max(d1,d2),h1c+h2c);
        }
    }
