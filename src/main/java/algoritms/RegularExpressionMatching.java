package algoritms;

/**
 * https://leetcode.com/problems/regular-expression-matching/
 * 10. Regular Expression Matching
 *
 *  1. Сначала проверяется, не пуста ли строка p. Если p пуста, то возвращается результат проверки, не пуста ли строка s.
 *  2. Затем проверяется, совпадают ли первые символы строки s и шаблона p, или первый символ p является ‘.’
 *      (который может совпадать с любым символом).
 *  3. Если в p есть символ ‘*’ на второй позиции, код делает одно из двух:
 *      * Пытается сопоставить остаток строки s с остатком шаблона p после ‘*’.
 *      * Если первые символы совпадают, пытается сопоставить остаток строки s с полным шаблоном p.
 *  4. Если на второй позиции в p нет ‘*’, код просто проверяет, совпадают ли первые символы,
 *      а затем пытается сопоставить остаток строки s и шаблона p.
 *
 * Таким образом, этот код рекурсивно обрабатывает различные части строки и шаблона, чтобы определить, соответствуют ли они друг другу.
 *
 */
public class RegularExpressionMatching {
    public static boolean isMatch(String s, String p) {
        if (p.isEmpty()) {
            return s.isEmpty();
        }

        boolean firstMatch = (!s.isEmpty() &&
                (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.'));

        if (p.length() >= 2 && p.charAt(1) == '*') {
            return (isMatch(s, p.substring(2)) ||
                    (firstMatch && isMatch(s.substring(1), p)));
        } else {
            return firstMatch && isMatch(s.substring(1), p.substring(1));
        }
    }
}

/**
 * class Solution {
 *     public boolean isMatch(String s, String p) {
 *         int n = s.length();
 *         int m = p.length();
 *         Boolean [][] cache = new Boolean[n + 1][m + 1];
 *
 *         return dfs(s, p, 0, 0, cache);
 *     }
 *
 *     public boolean dfs(String s, String p, int i, int j, Boolean[][] cache){
 *         if(i >= s.length() && j >= p.length()){
 *             return true;
 *         }
 *         if(j >= p.length()){
 *             return false;
 *         }
 *         if(cache[i][j] != null){
 *             return cache[i][j];
 *         }
 *         boolean match = false;
 *         boolean charMatch = (i < s.length()) && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.');
 *         if(j + 1 < p.length() && p.charAt(j + 1) == '*'){
 *             match = dfs(s, p, i, j + 2, cache) || (charMatch && dfs(s, p, i + 1, j, cache));
 *         }
 *         else{
 *             match = charMatch && dfs(s, p, i + 1, j + 1, cache);
 *         }
 *         return cache[i][j] = match;
 *     }
 * }
 */