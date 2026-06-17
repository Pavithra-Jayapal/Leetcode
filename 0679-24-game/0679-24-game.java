class Solution {
    public boolean solve(List<Double> ans){
        if(ans.size()==1){
            return Math.abs(ans.get(0)-24)<1e-6;//0.000001
        }
        for(int i=0;i<ans.size();i++){
            for(int j=i+1;j<ans.size();j++){
                List<Double> next=new ArrayList<>();//to store rem unused nums
                for(int k=0;k<ans.size();k++){
                    if(k!=i && k!=j){
                        next.add(ans.get(k));
                    }
                }
               double a=ans.get(i);
               double b=ans.get(j);
               List<Double> res=new ArrayList<>();            
               res.add(a+b);
               res.add(a-b);
               res.add(b-a);
               res.add(a*b);
               if(b>1e-6){
               res.add(a/b);
               }
               if(a>1e-6){
                res.add(b/a);
               }
               for(int itr=0;itr<res.size();itr++){
                next.add(res.get(itr));
                if(solve(next)==true){
                    return true;
                }
                next.remove(next.size()-1);
               }
            }
        }
        return false;
    }
    public boolean judgePoint24(int[] cards) {
        List<Double> ans=new ArrayList<>();
        for(int i=0;i<cards.length;i++){
            ans.add((double)cards[i]);
        }
        return solve(ans);
    }
}