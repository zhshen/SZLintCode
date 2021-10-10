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

        List<Interval> list = new ArrayList<Interval>();

        list.add(new Interval(1, 3));
        list.add(new Interval(2, 6));
        list.add(new Interval(8, 10));
        list.add(new Interval(15, 18));

        output(solution.merge(list));
    }
}
