class Solution {
    public int[] numberGame(int[] nums) {
       Arrays.sort(nums);
       ArrayList<Integer> a=new ArrayList<>();
       for(int i=0;i<nums.length-1;i+=2){
        int alice=nums[i];
        int bob=nums[i+1];
        a.add(bob);
        a.add(alice);
       } 
       int res[]=new int[nums.length];
       for(int i=0;i<nums.length;i++){
        res[i]=a.get(i);
       }
       return res;
    }
}