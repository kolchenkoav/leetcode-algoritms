package algoritms;

/**
 * https://leetcode.com/problems/container-with-most-water/description/
 * 11. Container With Most Water
 *
 *  Данный код решает задачу о контейнере с наибольшим объемом воды. Он находит максимальное количество воды,
 *  которое можно вместить между двумя вертикальными отрезками заданной высоты.
 *
 * В начале кода объявляются переменные maxArea, left и right. Переменная maxArea будет хранить максимальный объем воды,
 *  left и right - индексы левого и правого отрезков соответственно.
 *
 * В цикле while происходит перебор всех возможных пар отрезков. В каждой итерации цикла вычисляется объем воды,
 * который можно вместить между отрезками (Math.min(height[left], height[right]) * (right - left)).
 * Этот объем сравнивается с текущим maxArea, и если он больше, то maxArea обновляется.
 *
 * Если высота левого отрезка меньше высоты правого (height[left] < height[right]), то левый отрезок сдвигается вправо
 * на одну позицию (left++), иначе сдвигается правый отрезок (right--).
 *
 * Цикл продолжается до тех пор, пока left < right. После завершения цикла возвращается значение maxArea,
 * которое представляет собой максимальный объем воды, который можно вместить между отрезками заданной высоты.
 *
 */
public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
