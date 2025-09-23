class Solution {
    public int alternateDigitSum(int n) {
        String s=String.valueOf(n);
        int sum=0,sign=1;
        for(int i=0;i<s.length();i++){
            int digit = s.charAt(i) - '0';
            sum+=digit*sign;
            sign= -sign;
        }
        return sum;
    }
}