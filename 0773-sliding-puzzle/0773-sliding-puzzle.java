class Solution {
    public String swap(String temp,int i,int j){
        char[] ch=temp.toCharArray();
        char t=ch[i];
        ch[i]=ch[j];
        ch[j]=t;
        return new String(ch);
    }
    public int slidingPuzzle(int[][] board) {
        int n=2;
        int m=3;
        String s="";
        String t="123450";
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                s=s+board[i][j];//inital string
            }
        }
        if(s.equals(t)) return 0;
        int nei[][]={{1,3},//0//each index neighbor swap index
                    {0,2,4},//1
                    {1,5},//2
                    {0,4},
                    {3,1,5},
                    {2,4}};
        Queue<String> q=new LinkedList<>();
        HashSet<String> set=new HashSet<>();//like visited
        q.offer(s);
        set.add(s);
        int level=0;
        while(!q.isEmpty()){
            int size=q.size();
            level++;
            for(int i=0;i<size;i++){
                String temp=q.poll();
                int ind=temp.indexOf('0');
                for(int ni:nei[ind]){
                    String ans=swap(temp,ind,ni);
                    if(ans.equals(t)){
                        return level;
                    }
                    if(!set.contains(ans)){
                        set.add(ans);
                        q.offer(ans);
                    }
                }
            }
        }
        return -1;
    }
}