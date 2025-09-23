class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxlen=0;
        for(int i=0;i<sentences.length;i++){
            String arr[]=sentences[i].split(" ");
            int n=arr.length;
            maxlen=Math.max(n,maxlen);
        }
        return maxlen;
    }
}