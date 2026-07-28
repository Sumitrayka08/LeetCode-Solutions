class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int [] arr=new int [n];
        int p_idx=0;
        int n_idx=1;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                arr[n_idx]=nums[i];
                n_idx +=2;

            }
            else{
                arr[p_idx]=nums[i];
                p_idx +=2;
            }
        }
        return arr;
        
    }
}