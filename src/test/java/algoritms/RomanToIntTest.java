package algoritms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanToIntTest {
    @Test
    void romanToInt() {
        assertEquals(3, RomanToInt.romanToInt("III"));
        assertEquals(58, RomanToInt.romanToInt("LVIII"));
        assertEquals(1994, RomanToInt.romanToInt("MCMXCIV"));
    }
}