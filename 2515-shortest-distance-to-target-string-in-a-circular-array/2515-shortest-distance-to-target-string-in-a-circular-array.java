class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n=words.length;
       int mindist=Integer.MAX_VALUE;
       for(int i=0;i<n;i++){
        if(words[i].equals(target)){
           int dist=Math.abs(i-startIndex); //actual distance from startindex
           int cir_dist=Math.min(dist,n-dist); //circular min of clock & anticlockwise for each dist becase multiple target are there
           mindist=Math.min(mindist,cir_dist); // overall min dist
        }
       } 
       if(mindist==Integer.MAX_VALUE) return -1;
       else return mindist;
    }
}