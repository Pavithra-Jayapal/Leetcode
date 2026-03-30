class Solution {
    public void combsum(int candidates[],int ind,int target,List<Integer> ans,List<List<Integer>> res){
        if(target==0){
            res.add(new ArrayList<>(ans));
            return;
        }
        for(int i=ind;i<candidates.length;i++){
            if(i>ind&&candidates[i]==candidates[i-1]) continue;
            if(candidates[i]>target) return;
            else{
                ans.add(candidates[i]);
                combsum(candidates,i+1,target-candidates[i],ans,res);
                ans.remove(ans.size()-1);
            }
        }

   }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        combsum(candidates,0,target,ans,res);
        return res;
    }
}