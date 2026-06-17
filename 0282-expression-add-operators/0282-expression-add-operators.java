class Solution {
    List<String> res=new ArrayList<>();
    public void solve(String num, int target,List<String> res,int i,long curr,long prev,String ans){
        if(i==num.length()){
            if(curr==target){
                res.add(ans);
            }
            return;
        }
        else{//i=1
            for(int j=i;j<num.length();j++){
                //j=1
                if(i!=j&&num.charAt(i)=='0'){
                    break;
                }
                String temp=num.substring(i,j+1);// temp="2"
                long a =Long.parseLong(temp);//a=3 prev=2 curr=3
                if(i==0){
                    solve(num,target,res,j+1,a,a,ans+temp);
                }
                else{
                    solve(num,target,res,j+1,curr+a,a,ans+"+"+temp);//add
                    solve(num,target,res,j+1,curr-a,-a,ans+"-"+temp);//sub
                    solve(num,target,res,j+1,curr-prev+prev*a,prev*a,ans+"*"+temp);//mul
                }
            }
        }
    }
    public List<String> addOperators(String num, int target) {
        solve(num,target,res,0,0,0,"");
        return res;
    }
}