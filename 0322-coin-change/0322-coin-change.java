//tabulation dp
class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
       int dp[][]=new int[n][amount+1];
       for(int i=0;i<n;i++){
        for(int j=0;j<=amount;j++){
             if(i==0){
                if(j%coins[0]==0){
                    dp[i][j]=j/coins[0];
                 }
                else{
                     dp[i][j]=Integer.MAX_VALUE/2;
                 }
                 continue;
                }
        int not_take=0+dp[i-1][j];
        int take=Integer.MAX_VALUE/2;
        if(coins[i]<=j){
            take=1+dp[i][j-coins[i]];
        }
     dp[i][j]=Math.min(take,not_take);
        }
       }
    int ans = dp[n-1][amount];
    return ans >= Integer.MAX_VALUE/2 ? -1 : ans;
    }
}