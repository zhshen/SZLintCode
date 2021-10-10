public class Solution {
    /**
     * @param str:    An array of char
     * @param offset: An integer
     * @return: nothing
     */
    public void rotateString(char[] str, int offset) {
        if (str == null || str.length == 0)
            return;

        offset = str.length - offset % str.length;

        reverseString(str, 0, offset - 1);
        reverseString(str, offset, str.length - 1);

        reverseString(str, 0, str.length - 1);
    }

    private static void reverseString(char[] str, int start, int end) {
        while (start < end) {
            char c = str[start];
            str[start++] = str[end];
            str[end--] = c;
        }
    }
}