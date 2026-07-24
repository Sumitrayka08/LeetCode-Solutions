class Solution {
    public void sortColors(int[] arr) {
        int temp;
        int n=arr.length;
        int low=0,mid=0,high=n-1;
        while(mid<=high){
            if(arr[mid]==0){
                 temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]= temp;
                low++;
                mid++;

            }
            else if(arr[mid]==1){
                
                mid++;

            }
            else{
                temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                
                high--;

            }
        }


        
    }
}