class Solution {
    public int maximumSwap(int num) {
        int len=String.valueOf(num).length();
        int arr[]=new int[len];
        int n=len-1;
        while(num>0){
            arr[n]=num%10;
            num/=10;
            n--;
        } 
        for(int i=0;i<len;i++){
            int min=i;
            for(int j=i+1;j<len;j++){
               if(arr[min]<=arr[j]){
                min=j;
               }
            }
            if(arr[min]>arr[i]){
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
            break;
            }
        }
        int ans=0;
        for(int i=0;i<len;i++){
            ans=ans*10+arr[i];
        }
        return ans;
    }
}