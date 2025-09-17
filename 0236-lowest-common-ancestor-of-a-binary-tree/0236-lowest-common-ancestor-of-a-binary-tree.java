/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        if(root.val==p.val||root.val==q.val) return root;
        root.left=lowestCommonAncestor(root.left,p,q);
        root.right=lowestCommonAncestor(root.right,p,q);
        if(root.left!=null&&root.right!=null){
            return root;
        }
        if(root.left!=null) return root.left;
        else {
            return root.right;
        }
    }
}