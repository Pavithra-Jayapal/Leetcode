class Solution {
    public int findJudge(int n, int[][] trust) {
        int dp[]=new int[n+1];
        int ep[]=new int[n+1];
        for(int t[]:trust){
            dp[t[0]]++;
            ep[t[1]]++;
        }
        for(int i=1;i<=n;i++){
            if(dp[i]==0&&ep[i]==n-1){
                return i;
            }
        }
        return -1;
    }
}