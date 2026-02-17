/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        StringBuilder res=new StringBuilder();
        if(root==null) return "";
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            if(curr==null){
                res.append("n ");
                continue;
            }
           res.append(curr.val+" ");
            q.offer(curr.left);
            q.offer(curr.right);
            
        }
        return res.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<TreeNode> qu=new LinkedList<>();
        if(data.equals("")) return null;
        String d[]=data.split(" ");
        TreeNode root=new TreeNode(Integer.parseInt(d[0]));
        qu.offer(root);
        int i=1;
        while(!qu.isEmpty()){
            TreeNode curr=qu.poll();
            if(!d[i].equals("n")){
                TreeNode left=new TreeNode(Integer.parseInt(d[i]));
                curr.left=left;
                qu.offer(left);
            }
            if(!d[i+1].equals("n")){
                TreeNode right=new TreeNode(Integer.parseInt(d[i+1]));
                curr.right=right;
                qu.offer(right);
            }
            i+=2;
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));