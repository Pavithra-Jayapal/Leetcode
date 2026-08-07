class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> res=new ArrayList<>();
        if(arr.length==2){
             res.add(Arrays.asList(arr[0],arr[1]));
             return res;
        }
        int min_diff=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
         min_diff=Math.min(min_diff,Math.abs(arr[i]-arr[i-1]));
        }
        //res.add(Arrays.asList(min_diff));
        for(int i=1;i<=arr.length-1;i++){
            if(Math.abs(arr[i]-arr[i-1])==min_diff){
                res.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
        return res;
    }
}