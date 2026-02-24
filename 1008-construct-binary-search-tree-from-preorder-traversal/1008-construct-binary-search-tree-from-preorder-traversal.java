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
    public TreeNode bstFromPreorder(int[] preorder) {
        return bstTree(preorder,Integer.MAX_VALUE,new int[]{0});
    }
    public TreeNode bstTree(int[] preorder,int bound,int[] ind){
        if(ind[0]==preorder.length||preorder[ind[0]]>bound) return null;
        TreeNode root=new TreeNode(preorder[ind[0]++]);
        root.left=bstTree(preorder,root.val,ind);
        root.right=bstTree(preorder,bound,ind);
        return root;
    }
}