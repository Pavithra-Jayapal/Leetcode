class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int arr[]=new int[k];
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int num:nums){
        map.put(num,map.getOrDefault(num,0)+1);
      }  
      int i=0;
      while(k-->0){
        int max=0;
        int topkey=0;
        for(int num:map.keySet()){
        if(map.get(num)>max){
            max=map.get(num);
            topkey=num;
        }
    }
    arr[i++]=topkey;
    map.remove(topkey);
     }
    
    return arr;
    }
}