class Solution {
    public int minOperations(int[] nums, int x) {
        int total=0;
        for(int num:nums) total+=num;
        int diff=total-x;
        int sum=0,i=0,j=0;
        int maxdist=-1;
        while(j<nums.length){
            sum+=nums[j];
            while(sum>diff && i<=j){
                sum-=nums[i];
                i++;
            }
            if(sum==diff){
                maxdist=Math.max(maxdist,j-i+1);
            }
            j++;
        }
        if(maxdist==-1) return maxdist;
        return nums.length-maxdist;
    }
}