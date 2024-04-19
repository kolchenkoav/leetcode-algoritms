package algoritms;

//
//

/**
 * https://leetcode.com/problems/longest-common-prefix/
 * 14. Longest Common Prefix
 *
 * Этот код находит самую длинную общую префиксную строку для набора строк. Алгоритм работает следующим образом:
 *
 * 1. Если длина массива `strs` равна нулю, то возвращается пустая строка.
 * 2. Инициализируется переменная `prefix`, которая содержит первую строку из массива `strs`.
 * 3. В цикле `for` перебираются все строки в массиве `strs`, начиная со второй.
 * 4. В цикле `while` проверяется, является ли первая буква каждой строки в массиве `strs` частью `prefix`.
 *      Если это не так, то `prefix` уменьшается на одну букву.
 * 5. Если `prefix` становится пустой строкой, то это означает, что больше нет общих префиксов, и метод возвращает пустую строку.
 * 6. После окончания цикла `for` возвращается `prefix`, которая содержит самую длинную общую префиксную строку для набора строк.
 *
 * Таким образом, этот код находит самую длинную общую префиксную строку для набора строк.
 */
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
