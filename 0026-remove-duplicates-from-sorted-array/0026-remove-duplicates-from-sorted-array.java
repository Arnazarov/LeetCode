class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) return 1;
        int ins = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1])
                nums[ins++] = nums[i];
        }
        return ins;
    }
}