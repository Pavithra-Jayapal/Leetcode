class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int n=arr.length;
        int ans[]=new int[arr.length];
        Stack<Integer> s=new Stack<>();
        for(int i=2*arr.length-1;i>=0;i--){
            int ind=i%n;
            while(!s.isEmpty()&& s.peek()<=arr[ind]){
                s.pop();
            }
                if(s.isEmpty()){
                    ans[ind]=-1;
                }
                else {
                    ans[ind]=s.peek();
                    
                }
            s.push(arr[ind]);
        }
        return ans;
    }
}