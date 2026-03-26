class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public void subset(int nums[],int i,List<Integer> list){
        if(i==nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[i]);
        subset(nums,i+1,list);
        list.remove(list.size()-1);
        int ind=i+1;
        while(ind<nums.length&&nums[ind]==nums[ind-1]){
            ind++;
        }
        subset(nums,ind,list);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        subset(nums,0,new ArrayList<>());
        return res;
    }
}