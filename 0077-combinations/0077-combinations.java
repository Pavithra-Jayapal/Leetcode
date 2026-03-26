class Solution {
        List<List<Integer>> res=new ArrayList<>();
    public void subset(int ind,int n,int k,List<Integer> curr){
        if(curr.size()==k){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=ind;i<=n;i++){
            curr.add(i);
            subset(i+1,n,k,curr);
            curr.remove(curr.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        subset(1,n,k,new ArrayList<>());
        return res;
    }
}