class Solution {
    public int waysToReachTarget(int target, int[][] types) {
        int n=types.length;
        int mod=1000000007;
        int dp[][]=new int [n+1][target+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=1;
        }
        for(int i=1;i<=n;i++){
            int count=types[i-1][0];
            int marks=types[i-1][1];
            for(int j=1;j<=target;j++){
                dp[i][j]=dp[i-1][j];
                for(int k=1;k<=count;k++){
                    if(j-k*marks>=0){
                        dp[i][j]=(dp[i][j]+dp[i-1][j-k*marks])%mod;
                    }
                    else{
                        break;
                    }
                }
            }
        }
        return dp[n][target];
    }
}