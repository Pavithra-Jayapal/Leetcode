class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean isAsc=true;
        boolean isDes=true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]) isDes=false;
            if(nums[i]>nums[i+1]) isAsc=false;
        }
        return isDes || isAsc;
    }
}