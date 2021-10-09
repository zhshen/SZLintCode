import java.util.List;

public class Solution {
    /**
     * @param nums: An integer array
     * @return: nothing
     */
    public void recoverRotatedSortedArray(List<Integer> nums) {
        if (nums == null)
            return;

        int point = findRotatedIndex(nums);

        if (point >= 0) {
            reverseArray(nums, 0, point);
            reverseArray(nums, point + 1, nums.size() - 1);
            reverseArray(nums, 0, nums.size() - 1);
        }
    }

    private static int findRotatedIndex(List<Integer> nums) {
        int result = -1;

        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i + 1) < nums.get(i)) {
                result = i;
                break;
            }
        }

        return result;
    }

    private static void reverseArray(List<Integer> nums, int start, int end) {
        while (start < end) {
            int s = nums.get(start);
            int e = nums.get(end);
            nums.set(start++, e);
            nums.set(end--, s);
        }
    }
}