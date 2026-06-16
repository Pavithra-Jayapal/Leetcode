class Solution {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        int n=buildings.length;
        List<List<Integer>> pairs=solve(buildings,0,n);
        return pairs;
    }
    //recursion
    public List<List<Integer>> solve(int[][] buildings,int start,int end){
        if(start>=end){
            return new ArrayList<>();
        }
        else if(start+1==end){
           List<List<Integer>> ans=new ArrayList<>();
           ans.add(Arrays.asList(buildings[start][0],buildings[start][2]));
           ans.add(Arrays.asList(buildings[start][1],0));
           return ans;
        }
        else{
            int mid=start+(end-start)/2;
            List<List<Integer>> left=solve(buildings,start,mid);
            List<List<Integer>> right=solve(buildings,mid,end);
            return merge(left,right);
        } 
    }
    public List<List<Integer>> merge(List<List<Integer>> left,List<List<Integer>> right){
        List<List<Integer>> res=new ArrayList<>();
        int h1=0,h2=0;
        int i=0,j=0,x=0;
        while(i<left.size()&&j<right.size()){
            if(left.get(i).get(0)<right.get(j).get(0)){
                x=left.get(i).get(0);
                h1=left.get(i).get(1);
                i++;
            }
            else if(left.get(i).get(0)>right.get(j).get(0)){
                x=right.get(j).get(0);
                h2=right.get(j).get(1);
                j++;
            }
            else{
                x=left.get(i).get(0);
                h1=left.get(i).get(1);
                h2=right.get(j).get(1);
                i++;
                j++;
            }
             int max=Math.max(h1,h2);
           if(res.isEmpty()||res.get(res.size()-1).get(1)!=max){
            res.add(Arrays.asList(x,max));
           }
        }
        while(i<left.size()){
           x=left.get(i).get(0);
           h1=left.get(i).get(1);
           i++;
           int max=Math.max(h1,h2);
           if(res.isEmpty()||res.get(res.size()-1).get(1)!=max){
            res.add(Arrays.asList(x,max));
           }
        }
        while(j<right.size()){
            x=right.get(j).get(0);
            h2=right.get(j).get(1);
            j++;
            int max=Math.max(h1,h2);
            if(res.isEmpty()||res.get(res.size()-1).get(1)!=max){
             res.add(Arrays.asList(x,max));
          }
        }
        return res;
    }
}