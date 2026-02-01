class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0,j=0,max=0;
        int sum=0;
        while(i<nums.length){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            sum+=nums[i];
            while(map.get(nums[i])>1){
                sum-=nums[j];
                map.put(nums[j],map.get(nums[j])-1);
                j++;
            }
            i++;
            max=Math.max(max,sum);
        }
        return max;
    }
}