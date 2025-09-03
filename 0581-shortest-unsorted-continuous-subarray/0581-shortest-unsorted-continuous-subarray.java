class Solution {
    public int findUnsortedSubarray(int[] nums) {
    int n=nums.length;
     int arr[]=new int[nums.length];
     for(int i=0;i<nums.length;i++){
        arr[i]=nums[i];
     }  
     for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    int  i=0,j=nums.length-1;
     while(i<n && nums[i]==arr[i]){
        i++;
     }
     while(j>0 && nums[j]==arr[j]){
        j--;
     }
     return (i>j)?0:j-i+1;
    }
}