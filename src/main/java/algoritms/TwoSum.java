package algoritms;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/description/
 * 1. Two Sum
 *
 * Этот код решает задачу "Двух сумм". Алгоритм работает следующим образом:
 *
 * 1. Создается словарь `map`, который будет использоваться для хранения пар чисел и их индексов в массиве `nums`.
 * 2. В цикле `for` перебираются все числа в массиве `nums`.
 * 3. Для каждого числа `nums[i]` вычисляется его дополнение `complement` до заданной цели `target`.
 * 4. Если `complement` уже присутствует в словаре `map`, то это означает, что пара чисел, сумма которых равна `target`,
 *      уже найдена. В этом случае возвращаются индексы этих чисел.
 * 5. В противном случае, `nums[i]` и его индекс `i` добавляются в словарь `map`.
 * 6. Если после окончания цикла `for` пара чисел, сумма которых равна `target`, не найдена, то возвращается пустой массив.
 *
 * Таким образом, этот код решает задачу "Двух сумм", находя два числа в массиве, сумма которых равна заданной цели.
 *
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
