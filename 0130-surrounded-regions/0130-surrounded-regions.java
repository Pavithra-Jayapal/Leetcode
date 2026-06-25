class Solution {
    public void BFS(char board[][],int i,int j){
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{i,j});
        board[i][j]='S';
        int[][] dir={{0,-1},{0,1},{1,0},{-1,0}};
        while(!q.isEmpty()){
            int curr[]=q.poll();
            int x=curr[0];
            int y=curr[1];
            for(int d[]:dir){
                int nx=x+d[0];
                int ny=y+d[1];
            if(nx>=0 && nx<board.length&&ny>=0&&ny<board[0].length && board[nx][ny]=='O'){
                    q.offer(new int[]{nx,ny});
                    board[nx][ny]='S';
                }
            }
        }

    }
    public void solve(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0||i==m-1||j==n-1){
                    if(board[i][j]=='O'){
                        BFS(board,i,j);
                    }
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                    if(board[i][j]=='S'){
                        board[i][j]='O';
                    }
                    else if(board[i][j]=='O'){
                        board[i][j]='X';
                    }
                }
            }
        }
}