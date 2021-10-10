import java.util.ArrayList;
import java.util.List;

public class helper {
    static void output(List<Interval> list) {
        StringBuilder strB = new StringBuilder();

        for (Interval interval : list) {
            if (strB.length() > 0)
                strB.append(',');

            strB.append("(" + interval.start + "," + interval.end + ")");
        }

        System.out.println("[" + strB.toString() + "]");
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        List<Interval> list1 = new ArrayList<Interval>();
        List<Interval> list2 = new ArrayList<Interval>();

        // list1.add(new Interval(1, 2));
        // list1.add(new Interval(3, 4));

        // list2.add(new Interval(2, 3));
        // list2.add(new Interval(5, 6));
        list1.add(new Interval(1, 2));
        list1.add(new Interval(3, 4));

        list2.add(new Interval(4, 5));
        list2.add(new Interval(6, 7));

        output(solution.mergeTwoInterval(list1, list2));
    }
}
