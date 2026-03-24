class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> l=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums) set.add(num);
        for(int i=1;i<=nums.length;i++){ //Because missing numbers could be outside your current min/max range.
            if(!set.contains(i)) l.add(i);
        }
        return l;
    }
}