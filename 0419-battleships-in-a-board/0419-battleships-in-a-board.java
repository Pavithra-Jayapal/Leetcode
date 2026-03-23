class Solution {
    public int countBattleships(char[][] board) {
     int row=board.length;
     int col=board[0].length;
     int cnt=0;
     boolean[][] vis=new boolean[row][col];
     for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            if(board[i][j]=='X'&&!vis[i][j]){
                dfs(board,i,j,vis,row,col);
                cnt++;
            }
        }
     } 
     return cnt;
    }
      void dfs(char[][] board,int r,int c,boolean vis[][],int row,int col){
        if(r<0 || c<0 || r>=row || c>=col||vis[r][c]||board[r][c]!='X') return;
        vis[r][c]=true;
        dfs(board,r+1,c,vis,row,col);
        dfs(board,r-1,c,vis,row,col);
        dfs(board,r,c+1,vis,row,col);
        dfs(board,r,c-1,vis,row,col);
      
    }
}