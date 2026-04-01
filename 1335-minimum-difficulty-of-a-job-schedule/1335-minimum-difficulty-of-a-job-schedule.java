class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {
        int n=jobDifficulty.length;
        if(n<d) return -1;
        int dp[][]=new int[d+1][n];
        for(int e[]:dp){
            Arrays.fill(e,Integer.MAX_VALUE);
        }
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(jobDifficulty[i],max);
            dp[1][i]=max;
        }
        for(int day=2;day<=d;day++){
            for(int i=day-1;i<n;i++){
                int cmax=0;
                for(int j=i;j>=day-1;j--){
                    cmax=Math.max(cmax,jobDifficulty[j]);
                    dp[day][i]=Math.min(dp[day][i],dp[day-1][j-1]+cmax);
                }
            }
        }
        return dp[d][n-1];
    }
}