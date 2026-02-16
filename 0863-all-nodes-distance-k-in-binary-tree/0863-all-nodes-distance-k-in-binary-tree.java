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
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        HashMap<TreeNode,TreeNode> map=new HashMap<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            if(curr.left!=null){
                map.put(curr.left,curr);
                q.offer(curr.left);
            }
            if(curr.right!=null){
                map.put(curr.right,curr);
                q.offer(curr.right);
            }
        }
        HashSet<TreeNode> s=new HashSet<>();
        int d=0;
        q.offer(target);
        s.add(target);
        while(!q.isEmpty()){
            int size=q.size();
            if(d==k) break;
            d++;
            for(int i=0;i<size;i++){
                 TreeNode curr=q.poll();
            if(curr.left!=null&&!s.contains(curr.left)){
                q.offer(curr.left);
                s.add(curr.left);
            }
            if(curr.right!=null&&!s.contains(curr.right)){
                q.offer(curr.right);
                s.add(curr.right);
            }
            if(map.get(curr)!=null&&!s.contains(map.get(curr))){
                q.offer(map.get(curr));
                s.add(map.get(curr));
            }
            }
        }
        List<Integer> l=new ArrayList<>();
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            l.add(curr.val);
        }
        return l;
    }
}