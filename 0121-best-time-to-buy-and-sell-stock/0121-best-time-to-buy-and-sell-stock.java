class Solution {
    public int maxProfit(int[] prices) {
        int curpro=prices[0];
        int maxpro=0;
        for(int i=1;i<prices.length;i++){
            curpro=Math.min(curpro,prices[i]);
            maxpro=Math.max(maxpro,prices[i]-curpro);
        }
        return maxpro;
    }
}