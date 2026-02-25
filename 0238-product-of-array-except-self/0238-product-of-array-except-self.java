class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] p=new int[n];
        int[] s=new int[n];
        p[0]=nums[0];
        s[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            p[i]=nums[i]*p[i-1];
        }
        for(int i=n-2;i>=0;i--){
            s[i]=nums[i]*s[i+1];
        }
        int l,r;
        for(int i=0;i<n;i++){
            if(i==0){
                l=1;
            }
            else{
                l=p[i-1];
            }
            if(i==n-1){
                r=1;
            }
            else{
                r=s[i+1];
            }
            nums[i]=l*r;
        }
        return nums;
    }
}