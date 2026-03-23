class Solution {
    class Pair{
        int row;
        int col;
        int day;
        Pair(int row,int col,int day){
            this.row=row;
            this.col=col;
            this.day=day;
        }
    }
    public int orangesRotting(int[][] grid) {
        Queue<Pair> q=new LinkedList<>();
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] vis=new boolean[m][n];
        int fresh=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2) q.offer(new Pair(i,j,0));
                if(grid[i][j]==1) fresh++;
            }
        }
        int day=0;
        while(!q.isEmpty()){
            Pair p=q.poll();
            int i=p.row;
            int j=p.col;
            int d=p.day;
            day=Math.max(day,d);
            if(i-1>=0&& !vis[i-1][j]&&grid[i-1][j]==1){
                q.offer(new Pair(i-1,j,d+1));
                vis[i-1][j]=true;
                fresh--;
            }
           if(j-1>=0&& !vis[i][j-1]&&grid[i][j-1]==1){
                q.offer(new Pair(i,j-1,d+1));
                vis[i][j-1]=true;
                fresh--;
           }
            if(i+1<m && !vis[i+1][j]&&grid[i+1][j]==1){
                q.offer(new Pair(i+1,j,d+1));
                vis[i+1][j]=true;
                fresh--;
            }
            if(j+1<n&& !vis[i][j+1]&&grid[i][j+1]==1){
                q.offer(new Pair(i,j+1,d+1));
                vis[i][j+1]=true;
                fresh--;
            } 
        }
        if(fresh==0) return day;
        return -1;
    }
}