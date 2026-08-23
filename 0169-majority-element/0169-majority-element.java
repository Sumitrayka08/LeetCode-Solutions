import java.util.*;


class Solution {
   public int majorityElement(int[] nums) {
       int n = nums.length;
       int count = 1;
       int majority = nums[0]; // Assume first element as candidate


       // Phase 1: Find potential majority candidate
       for (int i = 1; i < n; i++) {
           if (nums[i] == majority) {
               count++;
           } else {
               count--;
               if (count == 0) {
                   majority = nums[i];
                   count = 1;
               }
           }
       }


       // Phase 2: Verify the candidate
       int count1 = 0;
       for (int i = 0; i < n; i++) {
           if (nums[i] == majority) {
               count1++;
           }
       }


       // Return the element if it occurs more than n/2 times
       if (count1 > n / 2)
           return majority;
       else
           return -1; // No majority element found
   }
}



 