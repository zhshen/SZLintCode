import java.util.ArrayList;
import java.util.List;

public class helper {
    public static void main(String[] args) {
        Solution solution = new Solution();

        List<Interval> list = new ArrayList<Interval>();

        // list.add(new Interval(0, 30));
        // list.add(new Interval(5, 10));
        // list.add(new Interval(15, 20));

        list.add(new Interval(5, 8));
        list.add(new Interval(9, 15));

        System.out.println(solution.canAttendMeetings(list));
    }
}
