class Solution {
    public int lengthOfLastWord(String s) {
        String str[]=s.split(" ");
        int n=str.length;
        int num=str[n-1].length();
        return num;
    }
}