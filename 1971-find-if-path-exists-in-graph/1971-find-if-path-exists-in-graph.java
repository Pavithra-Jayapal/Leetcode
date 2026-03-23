class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
     List<List<Integer>> graph=new ArrayList<>();
     int dist[]=new int[n];
     Arrays.fill(dist,-1);
     for(int i=0;i<n;i++){
        graph.add(new ArrayList<>()); //adding list to no.of nodes 3node=3list;
     }
    for(int e[]:edges){
        graph.get(e[0]).add(e[1]);
        graph.get(e[1]).add(e[0]);
    }
    Queue<Integer> q=new LinkedList<>();//to do bfs we take queue.bfs to come     from source to destination if no path then false;
    q.offer(source);
    dist[source]=0;
    while(!q.isEmpty()){
        int node=q.poll();
        if(node==destination) return true;
        for(int nei:graph.get(node)){
            if(dist[nei]==-1){
               dist[nei]=dist[node]+1; 
               q.offer(nei);
            }
        }
    }
    return false;
    }
}