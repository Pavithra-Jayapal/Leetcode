class Solution {
    public int smallestNumber(int n, int t) {
        int num=n;
        int rem=1;
     while(num!=0){
        rem*=num%10;
        num/=10;
     }   
     if(rem%t==0) return n;
     int temp=0;
     for(int i=1;i<=9;i++){
        int n1=n+i;
         temp=n1;
        rem=1;
        while(n1!=0){
        rem*=n1%10;
        n1/=10;
        } 
     if(rem%t==0) break;
     }
     return temp;
    }
}