class Solution {
    public String firstPalindrome(String[] words) {
       for(String word:words){
        StringBuilder sb=new StringBuilder(word).reverse();
        if(sb.toString().equals(word)){
            return word;
        }
       } 
       return "";
    }
}