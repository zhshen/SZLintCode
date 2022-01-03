public class helper {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] A = { 1, 3, 6, 9, 21 };

        ArrayReader reader = new ArrayReader(A);

        System.out.println(solution.search(reader, 3));
    }
}
