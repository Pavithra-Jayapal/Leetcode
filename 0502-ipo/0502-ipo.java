class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        Queue<Integer> pro=new PriorityQueue<>(Collections.reverseOrder());
        Queue<int[]> cap=new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
        for(int i=0;i<capital.length;i++){
            cap.add(new int[]{capital[i],i});
        }
        while(k--!=0){
            while(!cap.isEmpty()&&w>=cap.peek()[0]){
                int ind=cap.poll()[1];
                pro.add(profits[ind]);
            }
            if(pro.size()==0) return w; 
            w+=pro.poll();
        }
        return w;
    }
}