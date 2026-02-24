class Solution {
    public int countPrimes(int n) {
        int ctr=0;
        if(n==1 || n==0 || n==2){
            ctr=0;
        }
        boolean isprime[]=new boolean[n];
        for(int i=2;i<n;i++){
            isprime[i]=true;
        }
        for(int i=2;i*i<n;i++){
            if(isprime[i]){
                for(int j=i*i;j<n;j+=i){
                    isprime[j]=false;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(isprime[i]){
                ctr++;
            }
        }
        return ctr;
    }
}