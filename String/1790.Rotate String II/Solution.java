public class Solution {
    /**
     * @param str:   An array of char
     * @param left:  a left offset
     * @param right: a right offset
     * @return: return a rotate string
     */
    public String RotateString2(String str, int left, int right) {
        if (str == null || str.length() == 0)
            return str;

        char[] charArray = str.toCharArray();

        int point = left % charArray.length;

        rotateString(charArray, 0, point - 1);
        rotateString(charArray, point, charArray.length - 1);
        rotateString(charArray, 0, charArray.length - 1);

        point = charArray.length - right % charArray.length;

        rotateString(charArray, 0, point - 1);
        rotateString(charArray, point, charArray.length - 1);
        rotateString(charArray, 0, charArray.length - 1);

        return String.valueOf(charArray);
    }

    private static void rotateString(char[] str, int start, int end) {
        while (start < end) {
            char c = str[start];
            str[start++] = str[end];
            str[end--] = c;
        }
    }
}