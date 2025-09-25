class Solution {
    public int findNumbers(int[] nums) {
      int cnt=0;
      for(int num:nums){
        int c=0;
        while(num!=0){
            int rem=num%10;
            c++;
            num/=10;
        }
        if(c%2==0) cnt++;
      }  
      return cnt;
    }
}