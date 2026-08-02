import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        int longest=0;
        int last=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]-1 == last){
                count=count+1;
                last=nums[i];
            }
            else if(nums[i]!=last){
                count=1;
                last=nums[i];
            }
            longest=Math.max(longest,count);
        }
        return longest;
    }
}