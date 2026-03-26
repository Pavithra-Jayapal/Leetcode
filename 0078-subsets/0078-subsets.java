class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public void Subset(int nums[],int i,List<Integer> list){
        if(i==nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[i]);
        Subset(nums,i+1,list);
        list.remove(list.size()-1);
        Subset(nums,i+1,list);
    }
    public List<List<Integer>> subsets(int[] nums) {
       Subset(nums,0,new ArrayList<>());
       return res; 
    }
}