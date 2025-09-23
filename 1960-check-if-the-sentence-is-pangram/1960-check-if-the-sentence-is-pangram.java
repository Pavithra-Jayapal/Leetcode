class Solution {
    public boolean checkIfPangram(String sentence) {
        HashMap<Character,Integer> map=new HashMap<>();
        int n=sentence.length();
        for(int i=0;i<n;i++){
            char ch=sentence.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        if(map.size()==26) return true;
        return false;
        
    }
}