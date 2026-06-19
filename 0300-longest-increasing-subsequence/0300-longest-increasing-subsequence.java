//memoixzation
class Solution {
    public int lis(int nums[],int i,int j,int dp[][]){
        if(i==-1){
            return 0;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        int not_take=0+lis(nums,i-1,j,dp);
        int take=0;
        if(j==nums.length||nums[i]<nums[j]){
            take=1+lis(nums,i-1,i,dp);
        }
        return dp[i][j]=Math.max(take,not_take);

    }
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
      int dp[][]=new int[n][n+1];
      for(int d[]:dp){
        Arrays.fill(d,-1);
      }  
      return lis(nums,nums.length-1,nums.length,dp);
    }
}