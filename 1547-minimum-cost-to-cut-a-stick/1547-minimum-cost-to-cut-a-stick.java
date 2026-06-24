//recursion
class Solution {
    public int minCost(int n, int[] cuts) {
        int len=cuts.length;
        Arrays.sort(cuts);
        int pos[]=new int [len+2];
        pos[0]=0;
        pos[len+1]=n;    //pos[]=[0,1,2,3,4,5,7];
        for(int i=1;i<=len;i++){
            pos[i]=cuts[i-1];
        }
        int dp[][]=new int[len+2][len+2];
        for(int d[]:dp){
            Arrays.fill(d,-1);
        }
        return solve(0,len+1,pos,dp);
    }
    public int solve(int i,int j,int pos[],int dp[][]){
        if(j-i<=1){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int min=Integer.MAX_VALUE;
        for(int k=i+1;k<j;k++){
            int cost=solve(i,k,pos,dp)+solve(k,j,pos,dp)+(pos[j]-pos[i]);
            min=Math.min(cost,min);
        }
        return dp[i][j]=min;
    }
}