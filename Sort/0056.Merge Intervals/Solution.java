import java.util.List;

/**
 * Definition of Interval: public classs Interval { int start, end; Interval(int
 * start, int end) { this.start = start; this.end = end; } }
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

        int lastIndex = 0;
        int currentIndex = 1;

        Interval last = list.get(lastIndex);

        while (currentIndex < list.size()) {
            Interval val = list.get(currentIndex++);

            if (compare(last, val) == 0) {
                last.end = Math.max(last.end, val.end);
            } else {
                last = list.get(++lastIndex);
                last.start = val.start;
                last.end = val.end;
            }
        }

        return list.subList(0, lastIndex + 1);
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