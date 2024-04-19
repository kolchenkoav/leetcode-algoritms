package algoritms;

/**
 * https://leetcode.com/problems/reverse-integer/
 * 7. Reverse Integer
 *
 * Этот код преобразует данное число в обратное, сохраняя его в пределах 32-битного целого числа. Алгоритм работает следующим образом:
 *
 * 1. Создается переменная `result`, которая будет содержать результат преобразования.
 * 2. В цикле `while` перебираются цифры числа `x`.
 * 3. Для каждой цифры числа `x` добавляется к `result` умноженная на соответствующую степень десятки.
 * 4. После окончания цикла `while` возвращается `result`, которое является обратным числом.
 *
 * Таким образом, этот код преобразует данное число в обратное, сохраняя его в пределах 32-битного целого числа.
 *
 */
public class ReverseInteger {
    public static int reverse(int x) {
        long result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            x = x / 10;
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) result;
    }
}
