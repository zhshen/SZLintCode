public class Solution {

    public int search(ArrayReader reader, int target) {
        int result = -1;
        int start = 0;
        int end = ArrayReader.MaxInt;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int v = reader.get(mid);

            if (v == target) {
                result = mid;
                break;
            } else if (v > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return result;
    }
}