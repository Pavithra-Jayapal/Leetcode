class Solution {
    private int dfs(int R,int C,int row,int col,int matrix[][],int dp[][]){
        int diff[][]=new int[][]{{-1,0},{0,-1},{1,0},{0,1}};
        int adjmax=0;
        if(dp[row][col]!=0){
            return dp[row][col];
        }
        for(int ctr=0;ctr<4;ctr++){
            int adjR=row+diff[ctr][0];
            int adjC=col+diff[ctr][1];
            if(adjR>=0 &&adjR<R && adjC>=0&&adjC<C){
                if(matrix[adjR][adjC]>matrix[row][col]){
                adjmax=Math.max(adjmax, dfs(R,C,adjR,adjC,matrix,dp));
                }
            }
        }
         dp[row][col]=adjmax+1;
            return dp[row][col];
    }
    public int longestIncreasingPath(int[][] matrix) {
        int R=matrix.length;
        int C=matrix[0].length;
        int maxPath=0;
        int dp[][]=new int[R][C];
        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                if(dp[row][col]==0){
                    dfs(R,C,row,col,matrix,dp);
                }
                maxPath=Math.max(maxPath,dp[row][col]);
            }
        }
        return maxPath;
    }
}