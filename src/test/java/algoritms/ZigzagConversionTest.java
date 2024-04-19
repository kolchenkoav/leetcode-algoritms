package algoritms;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * https://leetcode.com/problems/zigzag-conversion/description/
 * 6. Zigzag Conversion
 *
 * Этот код создает зигзагообразный шаблон, проходя по строке слева направо, непрерывно двигаясь вниз,
 *  а затем по диагонали вверх по строкам представленной сетки. Переменная cycleLen представляет длину цикла
 *  в зигзагообразном шаблоне. Для каждого символа в строке он добавляется в соответствующую строку в зигзагообразном шаблоне.
 *  Если текущая строка не является первой или последней строкой, и есть символ, который должен быть
 *  по диагонали выше текущего символа, он также добавляется в результат. Итоговый зигзагообразный шаблон
 *  получается путем чтения символов построчно.
 *
 * Обратите внимание, что этот код предполагает, что входная строка s не является null.
 * Если есть вероятность, что s может быть null, вы должны добавить проверку на null в начале метода.
 * Кроме того, этот код не обрабатывает случай, когда numRows меньше 1.
 * Если numRows может быть меньше 1, вы также должны добавить проверку на это.
 *
 */
class ZigzagConversionTest {
    @Test
    void convert() {
        assertThat(ZigzagConversion.convert("PAYPALISHIRING", 3)).isEqualTo("PAHNAPLSIIGYIR");
        assertThat(ZigzagConversion.convert("PAYPALISHIRING", 4)).isEqualTo("PINALSIGYAHRPI");
        assertThat(ZigzagConversion.convert("A", 1)).isEqualTo("A");
    }
}