class Solution {
    public boolean isPossible(int[] nums) {
        HashMap<Integer,Integer> availmap=new HashMap<>();
        HashMap<Integer,Integer> vacantmap=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            availmap.put(nums[i],availmap.getOrDefault(nums[i],0)+1);
        }
        for(int num:nums){
            if(availmap.get(num)==0){
                continue;
            }
            else if(vacantmap.getOrDefault(num,0)>0){
                availmap.put(num,availmap.get(num)-1);
                vacantmap.put(num,vacantmap.get(num)-1);
                vacantmap.put(num+1,vacantmap.getOrDefault(num+1,0)+1);
            }
            else if(availmap.getOrDefault(num,0)>0&&availmap.getOrDefault(num+1,0)>0&&availmap.getOrDefault(num+2,0)>0){
                availmap.put(num,availmap.get(num)-1);
                availmap.put(num+1,availmap.get(num+1)-1);
                availmap.put(num+2,availmap.get(num+2)-1);
                vacantmap.put(num+3,vacantmap.getOrDefault(num+3,0)+1);

            }
            else{
                return false;
            }
        }
        return true;
    }
}