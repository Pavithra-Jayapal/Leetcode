class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int cnt=0,sum=0;
        for(int num:costs){
            if(sum+num>coins) break;
            sum+=num;
             cnt++;
        }
        return cnt;
    }
}