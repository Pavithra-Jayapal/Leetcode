class Solution {
    public int minOperations(String s) {
        int min_1=0; //0101010
        int min_0=0; //1010101
        for(int i=0;i<s.length();i++){
            char ch=(i%2==0)?'0':'1';
            if(s.charAt(i)!=ch) min_1++;
            else min_0++;
        }
        return Math.min(min_1,min_0);
    }
}