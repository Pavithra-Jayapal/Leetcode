//memoization
class Solution {
    public int cc(int coins[],int i,int j,int dp[][]){
        if(i==0){
            if(j%coins[0]==0){
                return dp[i][j]=j/coins[0];
            }
            return dp[i][j]=Integer.MAX_VALUE/2;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int not_take=0+cc(coins,i-1,j,dp);
        int take=Integer.MAX_VALUE/2;
        if(coins[i]<=j){
            take=1+cc(coins,i,j-coins[i],dp);
        }
        return dp[i][j]=Math.min(take,not_take);
    }
    public int coinChange(int[] coins, int amount) {
       int dp[][]=new int[coins.length][amount+1];
       for(int d[]:dp){
        Arrays.fill(d,-1);
       }
       int ans=cc(coins,coins.length-1,amount,dp);
       return ans>=Integer.MAX_VALUE/2?-1:ans;
    }
}