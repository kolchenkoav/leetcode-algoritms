package algoritms;

/**
 * https://leetcode.com/problems/median-of-two-sorted-arrays
 * 4. Median of Two Sorted Arrays
 *
 * Для решения этой задачи можно использовать следующий алгоритм:
 *
 * 1. Объединить два массива в один отсортированный массив.
 * 2. Найти середину полученного массива.
 * 3. Если длина массива нечетная, то середина - это и есть искомое значение.
 * 4. Если длина массива четная, то середина - это индексы двух средних элементов.
 * 5. Если длина массива четная, то среднее арифметическое этих двух средних элементов является искомой медианой.
 */
public class MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] mergedArray = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                mergedArray[k++] = nums1[i++];
            } else {
                mergedArray[k++] = nums2[j++];
            }
        }
        while (i < m) {
            mergedArray[k++] = nums1[i++];
        }
        while (j < n) {
            mergedArray[k++] = nums2[j++];
        }
        int middle = (m + n) / 2;
        if ((m + n) % 2 == 0) {
            return (mergedArray[middle - 1] + mergedArray[middle]) / 2.0;
        } else {
            return mergedArray[middle];
        }
    }
}
