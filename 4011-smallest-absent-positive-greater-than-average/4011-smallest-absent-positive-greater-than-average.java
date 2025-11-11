class Solution {
    public int smallestAbsent(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
       int n=nums.length,sum=0;
       for(int i=0;i<n;i++){
        sum+=nums[i];
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
       }
       float avg=(float)sum/n;
       int x=(int)Math.floor(avg)+1;
       if(x<1) x=1;
       while(map.containsKey(x)){
        x++;
       }
       return x;

    }
}