class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
       String[] str=s.trim().split("\\s+");
       //String str1="";
       for(int i=str.length-1;i>0;i--){
        sb.append(str[i]);
        sb.append(" ");
       } 
       sb.append(str[0]);
       return sb.toString();
    }
}