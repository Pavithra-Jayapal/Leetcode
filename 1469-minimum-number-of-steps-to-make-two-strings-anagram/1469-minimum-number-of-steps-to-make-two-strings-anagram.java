class Solution {
    public int minSteps(String s, String t) {
       int n=s.length();
       int ans=0;
        int arr[]=new int[26];
        for(int i=0;i<n;i++){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;

        }
        for(int i:arr) {
          if(i>0){ 
            ans+=i;
          }
          }
       return ans;
    }
}