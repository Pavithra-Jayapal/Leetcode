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
    public boolean isCompleteTree(TreeNode root) {
        if(root==null) return true;
        TreeNode temp=root;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean ans=false;
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            if(curr==null){
                ans=true;
            }
            else{
                if(ans) return false;
                 q.offer(curr.left);
                q.offer(curr.right);
            }
            }
        return true;
    }
}