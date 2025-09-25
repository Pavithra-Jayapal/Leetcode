class Solution {
    public boolean judgeCircle(String moves) {
      int x=0,y=0;
      char ch[]=moves.toCharArray();
      for(char c:ch){
        if(c=='U') x++;
        else if(c=='D') x--;
        else if(c=='L') y++;
        else if(c=='R') y--;
      }  
      return x==0&&y==0;
    }
}