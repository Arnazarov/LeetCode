class Solution {
    public int removeElement(int[] nums, int val) {
        int ans = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                ans++;
                nums[ans] = nums[i];
            }
        }
        return ans + 1;
    }
}