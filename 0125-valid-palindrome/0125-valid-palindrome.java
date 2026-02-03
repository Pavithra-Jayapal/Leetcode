class Solution {
    public boolean isPalindrome(String s) {
        //Normalize the string
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }
        //Reverse the cleaned string
        String original = sb.toString();
        String rev= sb.reverse().toString();
        //Compare
        return original.equals(rev);
    }
}
