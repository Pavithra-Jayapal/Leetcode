class Solution {
    List<List<Integer>> res=new ArrayList();
    public void swap(int nums[],int i,int ind){
        int temp=nums[i];
        nums[i]=nums[ind];
        nums[ind]=temp;
    }
    public void permutation(int nums[],int ind){
        if(ind==nums.length){
            List<Integer> list=new ArrayList<>();
            for(int num:nums){
                list.add(num);
            }
            res.add(list);
            return;
        }
        for(int i=ind;i<nums.length;i++){
            swap(nums,i,ind);
            permutation(nums,ind+1);
            swap(nums,i,ind);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        permutation(nums,0);
        return res;
    }
}