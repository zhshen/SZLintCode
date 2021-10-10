public class helper {
    static void outputArray(char[] str) {
        if (str == null)
            return;

        StringBuilder strB = new StringBuilder();

        for (char c : str) {
            strB.append(c);
        }

        System.out.println("\"" + strB.toString() + "\"");
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        char[] str = { 'a', 'b', 'c', 'c', 'b', 'a'};
        // char[] str = { 'a', 'b', 'c', 'd', 'e', 'f', 'g'};

        solution.rotateString(str, 3);

        outputArray(str);
    }
}
