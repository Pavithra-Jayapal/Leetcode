class Solution {
    String[] arr={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
        solve(digits,res,"",0);
        return res;
    }
    public void solve(String digits,List<String> res,String ans,int i){
        //i=0,ans="",digits="23",i=0
        if(i==digits.length()){
            res.add(ans);
            return;
        }
        else{
            String temp=arr[digits.charAt(i)-'0'];//temp=abc
            for(int j=0;j<temp.length();j++){
                solve(digits,res,ans+temp.charAt(j),i+1);
            }
        }
    }
}