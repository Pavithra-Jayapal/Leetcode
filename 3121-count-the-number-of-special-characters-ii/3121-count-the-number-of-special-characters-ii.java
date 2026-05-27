class Solution {
    public int numberOfSpecialChars(String word) {
       int lastlow[]=new int[26];
       int firstup[]=new int[26];
       Arrays.fill(firstup,-1);
        Arrays.fill(lastlow,-1);
       for(int i=0;i<word.length();i++){
        char ch=word.charAt(i);
        if(Character.isLowerCase(ch)){
            lastlow[ch-'a']=i;
        }
        else{
            int ind=ch-'A';
            if(firstup[ind]==-1){
                firstup[ind]=i;
            }
        }
       }
       int cnt=0;
       for(int i=0;i<26;i++){
        if(firstup[i]!=-1&&lastlow[i]!=-1&&firstup[i]>lastlow[i]){
            cnt++;
        }
       }
       return cnt;
    }
}