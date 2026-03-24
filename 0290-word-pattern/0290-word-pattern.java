class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] st=s.split(" ");
        if(pattern.length()!=st.length) return false;
       HashMap<Character,String> map=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            if(map.containsKey(pattern.charAt(i))){
                if(map.get(pattern.charAt(i)).equals(st[i])) continue;
                else return false;
            }
            else{
            if(map.containsValue(st[i])) return false;
            else  map.put(pattern.charAt(i),st[i]);
        }
    }
    return true;
}
}