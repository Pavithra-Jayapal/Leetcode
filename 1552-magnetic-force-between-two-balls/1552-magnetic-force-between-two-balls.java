class Solution {
    public int maxDistance(int[] position, int m) {
       Arrays.sort(position);
       int n=position.length;
       int low=1;
       int high=position[n-1]-position[0];
       int ans=1;
       while(low<=high){
        int mid=low+(high-low)/2;
        if(canplace(position,mid,m)){
            ans=mid;
            low=mid+1;
        }
        else{
            high=mid-1;
        }
       } 
       return ans;
    }
    public boolean canplace(int position[],int dist,int m){
        int cnt=1;
        int last=position[0];
        for(int i=1;i<position.length;i++){
            if(position[i]-last>=dist){
                cnt++;
                last=position[i];
            }
            if(cnt==m) return true;
        }
        return false;
    }
}