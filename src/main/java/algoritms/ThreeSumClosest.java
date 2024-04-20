package algoritms;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/3sum-closest/description/
 * 16. 3Sum Closest.java
 *
 * Метод threeSumClosest работает следующим образом:
 *
 * 1. Сортировка массива: Массив nums сортируется в порядке возрастания. Это делается для того,
 *      чтобы мы могли правильно перемещать указатели в следующих шагах.
 * 2. Инициализация ближайшей суммы: Переменная closestSum инициализируется как сумма первых двух чисел
 *      и последнего числа в отсортированном массиве.
 * 3. Перебор массива: Затем происходит перебор элементов массива. Для каждого элемента nums[i]
 *      устанавливаются два указателя: start и end. start - это элемент, следующий за i, а end - это последний элемент массива.
 * 4. Поиск ближайшей суммы: Пока start меньше end, вычисляется сумма nums[i] + nums[start] + nums[end].
 *      Если эта сумма меньше целевого значения target, то start увеличивается на 1, чтобы увеличить сумму.
 *      Если сумма больше target, то end уменьшается на 1, чтобы уменьшить сумму.
 *      Если абсолютное значение разности между суммой и target меньше абсолютного значения разности
 *      между closestSum и target, то closestSum обновляется этой суммой.
 * 5. Возврат ближайшей суммы: После перебора всех элементов массива, метод возвращает closestSum,
 *      который является суммой трех чисел, ближайшей к target.
 *
 * Этот метод использует подход двух указателей и имеет временную сложность O(n^2), где n - это длина входного массива.
 * Это связано с тем, что для каждого элемента массива выполняется линейный проход по остальной части массива.
 * Пространственная сложность этого метода - O(log n) из-за сортировки массива.
 *
 */
public class ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[nums.length - 1];
        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1, end = nums.length - 1;
            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                if (sum < target) {
                    start++;
                } else {
                    end--;
                }
                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum;
                }
            }
        }
        return closestSum;
    }
}
