class Solution {
    public int maximalRectangle(char[][] matrix) {
       int row=matrix.length;
       int col=matrix[0].length;
       int height[]=new int[col];
       int max=0;
       for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            if(matrix[i][j]=='1') height[j]++;
            else{
                height[j]=0;
            }
        }
        max=Math.max(max,area(height));
       } 
       return max;
    }
    public int area(int height[]){
        Stack<Integer> stack=new Stack<>();
        int maxarea=0;
        int n=height.length;
        for(int i=0;i<=n;i++){
            int currheight=(i==n)?0:height[i];
            while(!stack.isEmpty()&&currheight<height[stack.peek()]){
                int H=height[stack.pop()];
                int width=stack.isEmpty()?i:i-stack.peek()-1;
                maxarea=Math.max(maxarea,H*width);
            }
           stack.push(i);
        }
        return maxarea;
    }
}