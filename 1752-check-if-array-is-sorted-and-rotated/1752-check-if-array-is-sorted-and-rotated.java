class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            // Compare current element with the next one (using modulo for wrap-around)
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
            // Optimization: exit early if we find more than one inversion
            if (count > 1) {
                return false;
            }
        }
        
        return true;
    }
}
