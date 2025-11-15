class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int n=set.size();
        int max=Integer.MIN_VALUE;
        if(n<3){
        for(int val:set){
            if(val>max){
                max=val;
            }
            }
            return max;
        }
        set.remove(Collections.max(set)); 
        set.remove(Collections.max(set)); 
        return Collections.max(set);
    }
}