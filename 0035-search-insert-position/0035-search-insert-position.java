class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0 || nums == null) return  0;
        int start = 0, end = nums.length, mid = 0;
        while (start < end) {
          mid = (start + end - 1) / 2;
          if (nums[mid] > target)
            end = mid;
          else if (nums[mid] < target)
            start = mid + 1;
          else
            return mid;
        }
        return start;
    }
}