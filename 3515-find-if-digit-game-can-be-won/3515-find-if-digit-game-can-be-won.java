class Solution {
    public boolean canAliceWin(int[] nums) {
        int sumsingle=0;
        int sumdou=0;
        for(int num:nums){
            if(num<10) sumsingle+=num;
            else{
                sumdou+=num;
            }
        }
        return sumsingle!=sumdou;
    }
}