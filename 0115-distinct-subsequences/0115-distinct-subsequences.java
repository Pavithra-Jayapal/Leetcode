//memoization
class Solution {
    public int numDistinct(String s, String t) {
       int n1=s.length();
       int n2=t.length();
       int dp[][]=new int[n1+1][n2+1];
       for(int d[]:dp){
        Arrays.fill(d,-1);
       }
       return ds(s,t,n1-1,n2-1,dp);
    }
    public int ds(String s, String t,int i,int j,int dp[][]){
        if(j==-1){
            return 1;//we may be get 1 full subsequence word
        }
        if(i==-1){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        else if(s.charAt(i)==t.charAt(j)){
            return dp[i][j]=ds(s,t,i-1,j-1,dp)+ds(s,t,i-1,j,dp);
        }
        else{
            return dp[i][j]=ds(s,t,i-1,j,dp);
        }
    }
}