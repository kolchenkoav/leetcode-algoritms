package algoritms;

/**
 * https://leetcode.com/problems/zigzag-conversion/
 * 6. Zigzag Conversion
 *
 * Этот код преобразует строку в зигзагообразный формат, используя заданное количество строк.
 * Алгоритм работает следующим образом:
 *
 * 1. Создается новый массив `result`, который будет содержать результат преобразования.
 * 2. В цикле `for` перебираются символы в строке `s`.
 * 3. Если текущий символ уже был добавлен в `result`, то он пропускается.
 * 4. Если текущий символ еще не был добавлен в `result`, то он добавляется в `result` на текущей строке.
 * 5. Если текущая строка `row` равна `numRows` - 1, то текущий символ добавляется в `result` на строке `numRows` - 1.
 * 6. Если текущая строка `row` равна 0, то текущий символ добавляется в `result` на строке 0.
 * 7. После окончания цикла `for` возвращается `result`, который содержит преобразованную строку.
 *
 * Таким образом, этот код преобразует строку в зигзагообразный формат, используя заданное количество строк.
 *
 */
public class ZigzagConversion {
    public static String convert(String s, int numRows) {
        if (numRows == 1) return s;

        StringBuilder result = new StringBuilder();
        int n = s.length();
        int cycleLen = 2 * numRows - 2;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < n; j += cycleLen) {
                result.append(s.charAt(j + i));
                if (i != 0 && i != numRows - 1 && j + cycleLen - i < n)
                    result.append(s.charAt(j + cycleLen - i));
            }
        }
        return result.toString();
    }
}
