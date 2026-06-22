//memoization
class Solution {
    public int upwo(int obstacleGrid[][],int dp[][],int i,int j){
        if(i==-1||j==-1||obstacleGrid[i][j]==1){
            return 0;
        }
        if(i==0&&j==0){
            return dp[i][j]=1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        return dp[i][j]=upwo(obstacleGrid,dp,i-1,j)+upwo(obstacleGrid,dp,i,j-1);

    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int dp[][]=new int[m+1][n+1];
        for(int d[]:dp){
            Arrays.fill(d,-1);
        }
         return upwo(obstacleGrid,dp,m-1,n-1);
    }
}