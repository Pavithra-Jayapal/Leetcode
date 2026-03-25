class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum=nums[0]+nums[1]+nums[2];//just initially assinging for checking
        
        for(int i=0;i<nums.length;i++){
            if(i>0&&nums[i]==nums[i-1]) continue;
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int currsum=nums[i]+nums[left]+nums[right];
                if(Math.abs(currsum-target)<Math.abs(sum-target)){
                    sum=currsum;
                }

                if(currsum==target){
                    return currsum;
                }
                else if(currsum>target) right--;
                else{
                    left++;
                }
            }
        }
        return sum;
    }
}