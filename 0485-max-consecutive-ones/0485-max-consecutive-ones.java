class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int cnt=0,max=0;
       // if(n==1&&nums[0]==1) return 1;(optional)
        for(int num:nums){
            if(num==1){
                cnt++;
            }
            else{
           // max=Math.max(cnt,max);
            cnt=0;
            }
          max=Math.max(cnt,max);

        }
        return max;
    }
}