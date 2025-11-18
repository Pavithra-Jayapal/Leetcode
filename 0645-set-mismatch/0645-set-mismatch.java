class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int arr[]=new int[2];
        for(int num:nums){
            if(!map.containsKey(num)){
                map.put(num,map.getOrDefault(num,0)+1);
            }
            else{
                arr[0]=num;
            }
        }
        for(int i=1;i<=nums.length;i++){
            if(!map.containsKey(i)) arr[1]=i;
        }
        return arr;
    }
}