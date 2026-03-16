class Solution {
    public void rotate(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        for(int i=0;i<row;i++){
            for(int j=i+1;j<col;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<row;i++){
            int n=0,m=col-1;
            while(n<=m){
                int temp=matrix[i][n];
                matrix[i][n]=matrix[i][m];
                matrix[i][m]=temp;
                n++;
                m--;
            }
        }
    }
}