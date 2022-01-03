public class helper {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] A = { 1, 2, 3, 4, 5, 6 };

        ArrayReader reader = new ArrayReader(A);

        System.out.println(solution.search(reader, 3));
    }
}
