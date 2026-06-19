class Solution {
    public boolean part(int nums[],int i,int j,Boolean dp[][]){
        if(i==0){
            return nums[0]==j;
        }
        if(j==0){
            return true;
        }
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        boolean not_take=part(nums,i-1,j,dp);
        boolean take=false;
        if(nums[i]<=j){
            take=part(nums,i-1,j-nums[i],dp);
        }
        return dp[i][j]=not_take||take;

          }
    
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int num:nums) sum+=num;
        if(sum%2!=0) return false;
        int target=sum/2;
        int n=nums.length;
        Boolean dp[][]=new Boolean[n][target+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<=target;j++){
                if(i==0){
                  dp[i][j]=(nums[0]==j);
                  continue;
                  }
                  if(j==0){
                    dp[i][0]= true;
                    continue;
                 }
        boolean not_take=dp[i-1][j];
        boolean take=false;
        if(nums[i]<=j){
            take=dp[i-1][j-nums[i]];
        }
        dp[i][j]=not_take||take;
            }
        }
        return dp[n-1][target];
    }
}