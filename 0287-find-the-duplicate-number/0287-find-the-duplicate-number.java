class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int ans=0;
        for(int num:nums){
            if(set.contains(num)) ans=num;
            set.add(num);
         }
         return ans;
    }
}