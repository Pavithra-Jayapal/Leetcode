class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        ArrayList<Integer> a=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        HashMap<Integer,Integer> map1=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        for(int i=0;i<nums2.length;i++){
            map1.put(nums2[i],map1.getOrDefault(nums2[i],0)+1);
        }
        for(int num:nums2){
           if(!a.contains(num)){
                if(map.containsKey(num)){
                a.add(num);
            }
           }
        }
        for(int n:nums3){
            if(!a.contains(n)){
                if(map.containsKey(n)||map1.containsKey(n)){
                    a.add(n);
                }
            }
        }
        return a;
    }
}