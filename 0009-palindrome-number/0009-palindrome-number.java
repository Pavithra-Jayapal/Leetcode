class Solution {
    public boolean isPalindrome(int x) {
      int rem=0,sum=0,y=x;
      while(x>0){
        rem=x%10;
        sum=sum*10+rem;
        x/=10;
      }  
      if(y==sum){
        return true;
      }
      else{
        return false;
      }
    }
}