package jp.or.venuspj.util.strings2;

import jp.or.venuspj.util.objects2.Objects2;

public class Strings2 {

    public static boolean isEmpty(String aStr) {
        if (Objects2.isNull(aStr)) return true;
        return "".equals(aStr);
    }

    public static boolean isNotEmpty(String aSrt) {
        return !isEmpty(aSrt);
    }

    public String repeat(String string, int count) {

        final int len = string.length();
        final long longSize = (long) len * (long) count;
        final int size = (int) longSize;
        if (size != longSize) {
            throw new ArrayIndexOutOfBoundsException("Required array size too large: " + longSize);
        }

        final char[] array = new char[size];
        string.getChars(0, len, array, 0);
        int n;
        for (n = len; n < size - n; n <<= 1) {
            System.arraycopy(array, 0, array, n, n);
        }
        System.arraycopy(array, 0, array, n, size - n);
        return new String(array);

    }

}
