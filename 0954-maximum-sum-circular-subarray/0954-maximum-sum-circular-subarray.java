class Solution {
    public int maxSubarraySumCircular(int[] nums) {
      int maxsum=nums[0],currmax=nums[0];
      int minsum=nums[0],currmin=nums[0];
      int total=0;
      for(int i=1;i<nums.length;i++){
        currmax=Math.max(nums[i],currmax+nums[i]);
        maxsum=Math.max(currmax,maxsum);
        currmin=Math.min(nums[i],currmin+nums[i]);
        minsum=Math.min(currmin,minsum);

        total+=nums[i];
      }  
      total+=nums[0];
      if(maxsum<0) return maxsum;
      return Math.max(maxsum,total-minsum);
    }
}