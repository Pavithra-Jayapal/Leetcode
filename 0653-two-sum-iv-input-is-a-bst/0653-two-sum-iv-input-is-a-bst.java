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
    public boolean findTarget(TreeNode root, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        return Target(map,root,k);

    }
    public boolean Target(HashMap map,TreeNode root, int k) {
        if(root==null) return false;
        int diff=k-root.val;
        if(map.containsKey(diff)){
            return true;
        }
        else{
            map.put(root.val,0);
        }
        return Target(map,root.left,k)||Target(map,root.right,k);
    }
}