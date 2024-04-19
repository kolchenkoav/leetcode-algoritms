package algoritms;

/**
 * https://leetcode.com/problems/zigzag-conversion/
 * 6. Zigzag Conversion
 *
 *
 */
public class ZigzagConversion {
    public static String convert(String s, int numRows) {
        if (numRows == 1) return s;

        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int cycleLen = 2 * numRows - 2;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < n; j += cycleLen) {
                sb.append(s.charAt(j + i));
                if (i != 0 && i != numRows - 1 && j + cycleLen - i < n)
                    sb.append(s.charAt(j + cycleLen - i));
            }
        }
        return sb.toString();
    }
}
