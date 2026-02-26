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
    static TreeNode first=null;
    static TreeNode last=null;
    static TreeNode mid=null;
    static TreeNode pre=null;
    static void dfs(TreeNode root){
        if(root==null) return;
        dfs(root.left);
        if(pre!=null&&pre.val>root.val){
            if(first==null){
            first=pre;
            mid=root;
        }
        else{
            last=root;
        }
    }
        pre=root;
        dfs(root.right);
    }
    public void recoverTree(TreeNode root) {
        first=null;
        last=null;
        mid=null;
        pre=null;
        dfs(root);
        if(last==null){
            int temp=first.val;
            first.val=mid.val;
            mid.val=temp;
        }
        else{
            int temp=first.val;
            first.val=last.val;
            last.val=temp;
        }
    }
}