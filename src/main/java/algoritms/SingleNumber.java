package algoritms;

/**
 * https://leetcode.com/problems/single-number/description/
 * 136. Single Number
 *
 * Этот код находит единственное число в массиве, которое встречается только один раз. Алгоритм работает следующим образом:
 *
 * 1. Инициализируется переменная `singleNumber`, которая будет содержать искомое число.
 * 2. В цикле `for` перебираются все числа в массиве `nums`.
 * 3. Для каждого числа `num` в массиве `nums` выполняется операция `XOR` с `singleNumber`.
 * 4. После окончания цикла `for` возвращается значение `singleNumber`, которое является единственным числом,
 *      встречающимся в массиве только один раз.
 *
 * Операция `XOR` используется, потому что она возвращает `true`, если только одно из двух чисел равно `true`, и `false`
 *      в противном случае. Таким образом, после применения `XOR` ко всем числам в массиве, `singleNumber`
 *      будет содержать единственное число, которое встречается только один раз.
 *
 */
public class SingleNumber {
    public static int singleNumber(int[] nums) {
        var singleNumber = 0;
        for (var num : nums) {
            singleNumber ^= num;
        }
        return singleNumber;
    }
}