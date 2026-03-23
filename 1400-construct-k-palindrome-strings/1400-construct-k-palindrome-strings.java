class Solution {
    public boolean canConstruct(String s, int k) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int cnt=0;
        for(int val:map.values()){
            if(val%2!=0) cnt++;
        }
        return cnt<=k && k<=s.length();
    }
}