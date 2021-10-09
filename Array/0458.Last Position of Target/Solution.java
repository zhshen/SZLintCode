public class Solution {
    /**
     * @param A: sorted integer array A
     * @param B: sorted integer array B
     * @return: A new sorted integer array
     */
    public int lastPosition(int[] nums, int target) {
        int result = -1;

        if (nums == null || nums.length == 0)
            return result;

        int start = 0;
        int end = nums.length - 1;

        while (start + 1 < end) {
            int mid = start + (end - start) / 2;

            int val = nums[mid];

            if (target < val)
                end = mid - 1;
            else if (target > val)
                start = mid + 1;
            else
                start = mid;
        }

        if (nums[end] == target)
            result = end;
        else if (nums[start] == target)
            result = start;

        return result;
    }
}