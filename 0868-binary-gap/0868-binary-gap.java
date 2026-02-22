class Solution {
    public int binaryGap(int n) {
        String bin=Integer.toBinaryString(n);
        int max=0,f=-1;
        for(int i=0;i<bin.length();i++){
            char ch=bin.charAt(i);
            if(ch=='1'){
                if(f!=-1){
                    max=Math.max(max,i-f);
                }
                f=i;
            }
           
        }
        return max;
    }
}