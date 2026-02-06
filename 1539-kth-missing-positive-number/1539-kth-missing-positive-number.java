class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr) map.put(num,map.getOrDefault(num,0)+1);
        int ans=0;
       for(int i=1;;i++){
        if(!map.containsKey(i)||k==0){
            ans=i;
            k--;
            if(k==0) break;
        }
       } 
       return ans;
    }
}