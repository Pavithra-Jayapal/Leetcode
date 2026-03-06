class Solution {
    public boolean checkOnesSegment(String s) {
        boolean ans=false;
        for(char ch:s.toCharArray()){
            if(ch=='0') ans=true;
            else if(ans){
                return false;
            }
        }
        return true;
    }
}