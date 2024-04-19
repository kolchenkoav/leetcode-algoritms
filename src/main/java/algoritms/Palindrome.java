package algoritms;

// 9. Palindrome Number

/**
 * https://leetcode.com/problems/palindrome-number/description/
 * 9. Palindrome Number
 *
 * Этот код проверяет, является ли число палиндромом. Палиндром - это число, которое читается одинаково слева направо и справа налево.
 *
 * Алгоритм работает следующим образом:
 *
 * 1. Если число отрицательное, то оно не является палиндромом и функция возвращает `false`.
 * 2. Создается переменная `reverse`, которая будет содержать обратное число.
 * 3. В цикле `while` перебираются цифры числа `x`.
 * 4. К переменной `reverse` добавляется следующая цифра числа `x` умноженная на соответствующую степень десятки.
 * 5. После окончания цикла `while` функция возвращает `true`, если число `x` равно обратному числу `reverse`, и `false` в противном случае.
 *
 * Таким образом, этот код проверяет, является ли число палиндромом.
 *
 */
public class Palindrome {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int reverse = 0;
        int temp = x;
        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        return x == reverse;
    }
}
