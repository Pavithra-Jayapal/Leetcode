class Solution {
    public int[] separateDigits(int[] nums) {
      ArrayList<Integer> a=new ArrayList<>();
      for(int num:nums){
        String s=String.valueOf(num);
        for(int i=0;i<s.length();i++){
            a.add(s.charAt(i)-'0');
        }
      }  
      int res[]=new int[a.size()];
        for(int i=0;i<a.size();i++){
            res[i]=a.get(i);
        }
      return res;
    }
}