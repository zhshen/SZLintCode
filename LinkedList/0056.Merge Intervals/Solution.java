import java.util.List;
/**
 * Definition of Interval:
 * public classs Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

public class Solution {
    /**
     * @param list1: one of the given list
     * @param list2: another list
     * @return: the new sorted list of interval
     */
    public List<Interval> merge(List<Interval> list) {

        if (list == null || list.size() <= 1)
            return list;

        list.sort((val1, val2) -> val1.start - val2.start);

        Interval last = list.get(0);
        int i = 1;

        while(i < list.size()) {
            Interval val = list.get(i);
            if (compare(last, val) == 0) {
                last.end = Math.max(last.end, val.end);
                list.remove(i);
            }
            else {
                last = val;
                i++;
            }
        }

        return list;
    }

    private static int compare(Interval i1, Interval i2) {
        int result = 0;

        if (i1.end < i2.start)
            result = -1;
        else if (i1.start > i2.end)
            result = 1;

        return result;
    }
}