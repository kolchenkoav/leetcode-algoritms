package algoritms;

/**
 * https://leetcode.com/problems/search-insert-position
 * 35. Search Insert Position
 *
 * Этот код ищет позицию, на которой нужно вставить целевое число в отсортированный массив,
 *      чтобы сохранить его упорядоченность. Алгоритм работает следующим образом:
 *
 * 1. Инициализируются переменные `lowIndex` и `highIndex`, которые указывают на начало и конец диапазона поиска.
 * 2. В цикле `while` перебираются элементы массива `nums` в диапазоне от `lowIndex` до `highIndex`.
 * 3. Для каждого элемента `middleIndex` в диапазоне проверяется, равен ли он целевому числу.
 *      Если это так, то возвращается позиция `middleIndex`.
 * 4. Если элемент `middleIndex` меньше целевого числа, то `lowIndex` увеличивается на 1.
 * 5. Если элемент `middleIndex` больше целевого числа, то `highIndex` уменьшается на 1.
 * 6. После окончания цикла `while` возвращается позиция, на которой нужно вставить целевое число в массив `nums`,
 *      чтобы сохранить его упорядоченность.
 *
 * Таким образом, этот код ищет позицию, на которой нужно вставить целевое число в отсортированный массив.
 *
 */
public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        var lowIndex = 0;
        var highIndex = nums.length - 1;

        while (lowIndex < highIndex) {
            var middleIndex = (lowIndex + highIndex) / 2;

            if (nums[middleIndex] == target) {
                return middleIndex;
            }

            if (nums[middleIndex] < target) {
                lowIndex = middleIndex + 1;
            }

            if (nums[middleIndex] > target) {
                highIndex = middleIndex - 1;
            }
        }

        return nums[lowIndex] >= target ? lowIndex : lowIndex + 1;
    }
}