//memoization:
class Solution {
    public int LCS(String s1,String s2,int i,int j,int dp[][]){
        if(i==-1||j==-1){
            return dp[i+1][j+1]=0;
        }
         if(dp[i+1][j+1]!=-1){
            return dp[i+1][j+1];
        }
        else if(s1.charAt(i)==s2.charAt(j)){
            return dp[i+1][j+1]=1+LCS(s1,s2,i-1,j-1,dp);
        }
        else{
            return dp[i+1][j+1]=Math.max(LCS(s1,s2,i-1,j,dp),LCS(s1,s2,i,j-1,dp));
        }
        
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int len1=text1.length();
        int len2=text2.length();
        int dp[][]=new int[len1+1][len2+1];
        for(int d[]:dp){
            Arrays.fill(d,-1);
        }
        return LCS(text1,text2,len1-1,len2-1,dp);
    }
}