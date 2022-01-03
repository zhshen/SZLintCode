public class ArrayReader {
    public static final int MaxInt = 2147483647;

    private int[] data;

    public ArrayReader(int[] array) {
        this.data = array;
    }

    int get(int k) {
        int result = ArrayReader.MaxInt;

        if (k >= 0 && k < data.length)
            result = this.data[k];

        return result;
    }
}
