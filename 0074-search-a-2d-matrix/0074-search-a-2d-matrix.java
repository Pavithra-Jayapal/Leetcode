class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int c=matrix[0].length;
        for(int i=0;i<matrix.length;i++){
            if(target<=matrix[i][c-1]){
               return bsearch(matrix[i],0,c-1,target);
            }
        }
        return false;
    }
    boolean bsearch(int a[],int l,int r,int target){
        while(l<=r){
            int mid=r-l/2;
            if(a[mid]==target) return true;
            else if(a[mid]<target) l=mid+1;
            else r=mid-1;
        }
        return false;
    }
}