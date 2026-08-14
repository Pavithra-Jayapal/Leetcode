class Solution {
    public int maximumLengthSubstring(String s) {
        int n=s.length();
        int left=0,right=0,max=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(right<n){
            char ch=s.charAt(right);
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            while(map.get(ch)>2){
                char left_ch=s.charAt(left);
                map.put(left_ch,map.get(left_ch)-1);
                left++;
            }
            max=Math.max(max,right-left+1);
            right++;
        }    
        return max;   
    }
}