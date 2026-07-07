class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> l=new ArrayList<>();
        int arr[]=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            l.add(new ArrayList<>());
        }
        for(int p[]:prerequisites){
            l.get(p[1]).add(p[0]);
            arr[p[0]]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(arr[i]==0) q.add(i);
        }
        int cnt=0;
        while(!q.isEmpty()){
            int curr=q.poll();
            cnt++;
            for(int nei:l.get(curr)){
                arr[nei]--;
               if(arr[nei]==0) q.add(nei);
            }
        }
        return cnt==numCourses;
     }
}