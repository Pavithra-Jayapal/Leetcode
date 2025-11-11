class Solution {
    public int minBitFlips(int start, int goal) {
        int ans=start^goal;
        String binary=Integer.toBinaryString(ans);
        int cnt=0;
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1'){
                cnt++;
            }
        }
        return cnt;
    }
}