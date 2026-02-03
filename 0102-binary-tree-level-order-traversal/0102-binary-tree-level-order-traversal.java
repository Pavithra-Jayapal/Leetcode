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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> l1=new ArrayList<>();
        if(root==null) return l1;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> l2=new ArrayList<>();
            int len=q.size();
            for(int i=0;i<len;i++){
                TreeNode n=q.poll();
                l2.add(n.val);
                if(n.left!=null){
                 q.offer(n.left);
                }
                if(n.right!=null){
                    q.offer(n.right);
                }
            }
            l1.add(l2);
        }
        return l1;
    }
}