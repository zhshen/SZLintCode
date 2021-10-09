import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class helper {
    static void outputArray(List<Integer> list) {
        if (list == null)
            return;

        StringBuilder strB = new StringBuilder();

        for (Iterator<Integer> it = list.iterator(); it.hasNext();) {
            if (strB.length() > 0)
                strB.append(',');

            strB.append(it.next());
        }

        System.out.println("[" + strB.toString() + "]");
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        ArrayList<Integer> nums =
            new ArrayList<Integer>(List.of(4, 5, 1, 2, 3));

        solution.recoverRotatedSortedArray(nums);

        outputArray(nums);
    }
}
