class Solution {
    public int subtractProductAndSum(int n) {
        int prt=1,sum=0;
        while(n>0){
            int rem=n%10;
            prt*=rem;
            sum+=rem;
            n/=10;
        }
        return prt-sum;
    }
}