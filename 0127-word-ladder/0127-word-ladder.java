class Solution {
    public boolean calculatediff(String del,String str){
        int diff=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=del.charAt(i)) diff++;
        }
        return diff==1;
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set=new HashSet<>();
        set.add(beginWord);
        for(String str:wordList) set.add(str);
        Queue<String> q=new LinkedList<>();
        q.offer(beginWord);
        int cnt=0;
        while(!q.isEmpty()){
            cnt++;
            int size=q.size();
            for(int i=0;i<size;i++){
            String del=q.poll();
            if(del.equals(endWord)) return cnt;
            List<String> l=new ArrayList<>();
            for(String str:set){
            if(calculatediff(del,str)){
                q.offer(str);
               l.add(str); 
            }
            }
            for(int j=0;j<l.size();j++) set.remove(l.get(j));
        }
      }
      return 0;
    }
}