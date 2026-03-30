class Solution {
    public void combsum(int ind,int k,int n,List<List<Integer>> res,List<Integer> ans){
        if(k==0&&n==0){
            res.add(new ArrayList<>(ans));
            return;
        }
        for(int i=ind;i<10;i++){
            if(i>n) return;
            else{
                ans.add(i);
                combsum(i+1,k-1,n-i,res,ans);
                ans.remove(ans.size()-1);
            }
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        combsum(1,k,n,res,ans);
        return res;
    }
}