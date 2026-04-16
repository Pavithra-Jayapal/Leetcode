class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> l=new ArrayList<>();
        int[] ind=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            l.add(new ArrayList<>());
        }
        for(int[] p:prerequisites){
            l.get(p[1]).add(p[0]);
            ind[p[0]]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(ind[i]==0) q.offer(i);
        }
        int cnt=0;
        while(!q.isEmpty()){
            int curr=q.poll();
            cnt++;
            for(int nei:l.get(curr)){
                ind[nei]--;
                if(ind[nei]==0) q.offer(nei);
            }
        }
        return cnt==numCourses;
     }
}