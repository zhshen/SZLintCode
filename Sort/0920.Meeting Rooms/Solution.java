import java.util.List;

/**
 * Definition of Interval: public classs Interval { int start, end; Interval(int
 * start, int end) { this.start = start; this.end = end; } }
 */

public class Solution {
    /**
     * @param intervals: an array of meeting time intervals
     * @return: if a person could attend all meetings
     */
    public boolean canAttendMeetings(List<Interval> intervals) {
        if (intervals == null || intervals.isEmpty())
            return true;

        intervals.sort((val1, val2) -> val1.start - val2.start);

        boolean result = true;
        int left = 0;
        int right = 1;

        Interval last = intervals.get(left);

        while (right < intervals.size()) {
            Interval val = intervals.get(right++);

            if (compare(last, val) == 0) {
                result = false;
                break;
            } else {
                last = intervals.get(++left);
                last.start = val.start;
                last.end = val.end;
            }
        }

        return result;
    }

    private static int compare(Interval val1, Interval val2) {
        int result = 0;

        if (val1.end <= val2.start)
            result = -1;
        else if (val1.start >= val2.end)
            result = 1;

        return result;
    }
}