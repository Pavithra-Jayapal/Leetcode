class Solution {
    public int dominantIndex(int[] nums) {
        int maxind=-1,max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                maxind=i;
            }
        }
        for(int num:nums){
            if(max<2*num&&num!=max ){
                return -1;
            }
        }
        return maxind;
    }
}