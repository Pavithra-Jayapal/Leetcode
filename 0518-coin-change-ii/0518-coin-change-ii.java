class Solution {
    public int cc(int coins[],int i,int j,int dp[][]){
        if(i==0){
            if(j%coins[0]==0){
                return 1;
            }
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int not_take=cc(coins,i-1,j,dp);
        int take=0;
        if(coins[i]<=j){
            take=cc(coins,i,j-coins[i],dp);
        }
         return dp[i][j]=take+not_take;
    }
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int dp[][]=new int[n][amount+1];
        for(int d[]:dp){
            Arrays.fill(d,-1);
        }
        return cc(coins,n-1,amount,dp);
    }
}