class Solution {
    int ans=Integer.MAX_VALUE;
    public boolean canplace(int[][] grid,int x,int y,int k,int n,int m){
        if(x+k>n||y+k>m){
            return false;
        }
        for(int i=x;i<x+k;i++){
            for(int j=y;j<y+k;j++){
                if(grid[i][j]==1){
                    return false;
                }
            }
        }
        return true;
    }
    public void place(int[][] grid,int x,int y,int k,int val){
        for(int i=x;i<x+k;i++){
            for(int j=y;j<y+k;j++){
                grid[i][j]=val;
            }
        }
    }
    public void solve(int[][] grid,int n,int m,int count){
        if(count>=ans) return;
        int x=-1,y=-1;//to find first zero having cell
        for(int i=0;i<n&&x==-1;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==0){
                    x=i;
                    y=j;
                    break;
                }
            }
        }
        if(x==-1){
            ans=Math.min(ans,count);
            return;
        }

        for(int k=Math.min(n-x,m-y);k>=1;k--){
            if(canplace(grid,x,y,k,n,m))//to check safe
            {
                place(grid,x,y,k,1);
                solve(grid,n,m,count+1);
                place(grid,x,y,k,0);
            }
        }
    }
    public int tilingRectangle(int n, int m) {
        int grid[][]=new int[n][m];
        solve(grid,n,m,0);
        return ans;
    }
}