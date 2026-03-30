class Solution {
    public int edgeScore(int[] edges) {
        int n=edges.length;
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(edges[i])){
               map.get(edges[i]).add(i);
            }
            else{
                List<Integer> l=new ArrayList<>();
                l.add(i);
                map.put(edges[i],l);
            }
        }
        int ansNode = -1;
        long maxScore = -1;
        for(int key : map.keySet()){
            long sum=0;
            for (int num : map.get(key)) {
                sum += num;
            }
            if (sum > maxScore || (sum == maxScore && key < ansNode)) {
                maxScore = sum;
                ansNode = key;
            }
    }
    return ansNode;
}
}