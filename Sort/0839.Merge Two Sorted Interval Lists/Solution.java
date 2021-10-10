import java.util.ArrayList;
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
    public List<Interval> mergeTwoInterval(List<Interval> list1, List<Interval> list2) {

        if (list1 == null)
            return list2;

        if (list2 == null)
            return list1;

        List<Interval> result = new ArrayList<Interval>();

        int i1 = 0;
        int i2 = 0;

        while (i1 < list1.size() && i2 < list2.size()) {
            Interval val1 = list1.get(i1);
            Interval val2 = list2.get(i2);

            switch (compare(val1, val2)) {
                case -1:
                    addOrMerge(result, val1);
                    i1++;
                    break;
                case 1:
                    addOrMerge(result, val2);
                    i2++;
                    break;
                default:
                    addOrMerge(result, merge(val1, val2));
                    i1++;
                    i2++;
                    break;
            }
        }

        appendTo(result, list1, i1);
        appendTo(result, list2, i2);

        return result;
    }

    private static void addOrMerge(List<Interval> list, Interval val) {
        if (list.isEmpty() == false) {
            Interval last = list.get(list.size() - 1);

            if (compare(last, val) == 0)
                list.set(list.size() - 1, merge(last, val));
            else
                list.add(val);
        } else
            list.add(val);
    }

    private static Interval merge(Interval val1, Interval val2) {
        return new Interval(Math.min(val1.start, val2.start), Math.max(val1.end, val2.end));
    }

    private static void appendTo(List<Interval> target, List<Interval> source, int start) {
        for (int i = start; i < source.size(); i++)
            addOrMerge(target, source.get(i));
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