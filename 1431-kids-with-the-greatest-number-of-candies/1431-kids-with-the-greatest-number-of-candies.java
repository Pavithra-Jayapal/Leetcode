class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
      int max=0;
      List<Boolean> l=new ArrayList<>();
      for(int num:candies) max=Math.max(max,num);
      for(int num:candies){
        if(num+extraCandies>=max) l.add(true);
        else l.add(false);
      }
      return l;
    }
}