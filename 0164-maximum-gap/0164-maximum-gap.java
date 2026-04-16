class Solution {
    public int maximumGap(int[] nums) {
      int n=nums.length;
      if(n<2) return 0;
      Arrays.sort(nums);
      int i=0,j=i+1;
      int max=0;
      while(i<n&&j<n){
        max=Math.max(max,Math.abs(nums[i]-nums[j]));
        i++;
        j++;
      }  
      return max;
    }
}