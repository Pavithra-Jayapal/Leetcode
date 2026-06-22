class Solution {
    public int up(int dp[][],int i,int j){
        if(i==-1||j==-1){
            return 0;
        }
        if(i==0&&j==0) return dp[i][j]=1;
        if(dp[i][j]!=-1) return dp[i][j];
        return dp[i][j]=up(dp,i-1,j)+up(dp,i,j-1);
    }
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m+1][n+1];
        for(int d[]:dp){
            Arrays.fill(d,-1);
        }
        return up(dp,m-1,n-1);
    }
}