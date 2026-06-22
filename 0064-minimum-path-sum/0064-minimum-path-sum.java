class Solution {
    public int mps(int [][]grid,int dp[][],int i,int j){
        if(i==-1||j==-1){
            return Integer.MAX_VALUE;
        }
        if(i==0&&j==0){
            return grid[i][j];
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        return dp[i][j]=grid[i][j]+Math.min(mps(grid,dp,i-1,j),mps(grid,dp,i,j-1));
    }
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int dp[][]=new int[m][n];
        for(int d[]:dp){
            Arrays.fill(d,-1);
        }
        return mps(grid,dp,m-1,n-1);
    }
}