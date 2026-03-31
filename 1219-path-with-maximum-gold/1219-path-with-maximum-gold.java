class Solution {
    public int  dfs(int grid[][],int i,int j,boolean vis[][],int m,int n){
        if(i>=m||j>=n||i<0||j<0||grid[i][j]==0||vis[i][j]){
            return 0;
        }
        int cost=grid[i][j];
        vis[i][j]=true;
       cost+= Math.max(dfs(grid,i+1,j,vis,m,n),Math.max(dfs(grid,i-1,j,vis,m,n),Math.max(dfs(grid,i,j+1,vis,m,n),dfs(grid,i,j-1,vis,m,n))));
       vis[i][j]=false;
       return cost;
    }
    public int getMaximumGold(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int max=0;
        boolean vis[][]=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=0){
                    int cost=dfs(grid,i,j,vis,m,n);
                    max=Math.max(max,cost);
                }
            }
        }
        return max;
    }
}