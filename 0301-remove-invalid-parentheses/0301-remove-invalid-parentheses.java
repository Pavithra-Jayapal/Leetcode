class Solution {
    HashSet<String> res=new HashSet<>();
    public void solve(String s,StringBuilder sb,int left,int right,int i,int open)
//i-start ind of string,open-stringbuilder open brackets  
    {
        if(i==s.length()){
            if(left==0&&right==0&&open==0){
                res.add(sb.toString());   
            }
            return;
        }
    //remove
        int len=sb.length();
        if(s.charAt(i)=='('&&left>0){
            solve(s,sb,left-1,right,i+1,open);
        }
        if(s.charAt(i)==')'&&right>0){
            solve(s,sb,left,right-1,i+1,open);
        }
    //keep
        sb.append(s.charAt(i));
        if(s.charAt(i)=='('){
        solve(s,sb,left,right,i+1,open+1);
        }
        else if(s.charAt(i)==')'){
            if(open>0){
                solve(s,sb,left,right,i+1,open-1);
            }
        }
        else{
        solve(s,sb,left,right,i+1,open);
           
        }
        sb.deleteCharAt(len);//backtraking
    }
    public List<String> removeInvalidParentheses(String s) {
        int left=0,right=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                left++;
            }
            else if(s.charAt(i)==')'){
                if(left>0) left--;
                else right++;
            }
        }
        solve(s,sb,left,right,0,0);
        return new ArrayList<>(res);
    }
}