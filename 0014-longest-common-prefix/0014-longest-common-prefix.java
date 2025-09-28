class Solution {
    public String longestCommonPrefix(String[] strs) {
     Arrays.sort(strs);
     String str=strs[0];
     String str2=strs[strs.length-1];
     StringBuilder sb=new StringBuilder();
     for(int i=0;i<str.length();i++){
        if(str.charAt(i)!=str2.charAt(i)){
            return sb.toString();
        }
        sb.append(str.charAt(i));
     }
     return sb.toString();
    }
}