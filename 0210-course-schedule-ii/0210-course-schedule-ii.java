class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> l=new ArrayList<>();
        int ind[]=new int[numCourses];//indegree
        for(int i=0;i<numCourses;i++){
            l.add(new ArrayList<>());
        }
        for(int[] p:prerequisites){
            l.get(p[1]).add(p[0]);
            ind[p[0]]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(ind[i]==0) q.add(i);
        }
        int res[]=new int[numCourses];
        int idx=0;
        while(!q.isEmpty()){
            int curr=q.poll();
            res[idx++]=curr;
            for(int nei:l.get(curr)){
                if(--ind[nei]==0) q.offer(nei);
            }
        }
        return idx==numCourses? res:new int[0];
    }
}