package algoritms;

/**
 * https://leetcode.com/problems/longest-palindromic-substring/
 * 5. Longest Palindromic Substring
 *
 * Этот код находит самую длинную палиндромную подстроку в строке. Алгоритм работает следующим образом:
 *
 * 1. Проверяется, является ли строка `s` пустой или `null`. Если это так, то возвращается пустая строка.
 * 2. Инициализируются переменные `start` и `end`, которые будут указывать на начало и конец самой длинной палиндромной подстроки.
 * 3. В цикле `for` перебираются все символы строки.
 * 4. Для каждого символа `s.charAt(i)` вызывается метод `expandAroundCenter()`, который возвращает длину палиндрома, начинающегося и заканчивающегося на `i`.
 * 5. Если длина палиндрома, возвращаемого методом `expandAroundCenter()`, больше, чем текущая длина самой длинной палиндромной подстроки (`end - start`), то обновляются значения `start` и `end`.
 * 6. После окончания цикла `for` возвращается подстрока, начиная с `start` и заканчивая на `end`.
 *
 * Метод `expandAroundCenter()` ищет самую длинную палиндромную подстроку, начинающуюся и заканчивающуюся на `i` или `i + 1`. Он делает это, сдвигая указатели `L` и `R` влево и вправо, пока символы на этих позициях совпадают и не выходят за пределы строки.
 *
 * Таким образом, этот код находит самую длинную палиндромную подстроку в строке.
 */
public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }
    private static int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
}
