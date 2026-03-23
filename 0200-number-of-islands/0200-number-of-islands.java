class Solution {
    public int numIslands(char[][] grid) {
        int island=0;
        int R=grid.length,C=grid[0].length;
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(grid[i][j]=='1'){
                    island++;
                    dfs(R,C,grid,i,j);
                }
            }
        }
        return island;
    }
    void dfs(int r,int c,char[][] grid,int i,int j){
        if(i<0 || j<0 || j>=c || i>=r || grid[i][j]!='1') return;
        grid[i][j]='0';
        dfs(r,c,grid,i+1,j);
        dfs(r,c,grid,i-1,j);
        dfs(r,c,grid,i,j+1);
        dfs(r,c,grid,i,j-1);
    }
}