package algoritms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IntegerToRomanTest {
    @Test
    void intToRoman() {
        assertEquals("III", IntegerToRoman.intToRoman(3));
        assertEquals("IV", IntegerToRoman.intToRoman(4));
        assertEquals("IX", IntegerToRoman.intToRoman(9));
        assertEquals("LVIII", IntegerToRoman.intToRoman(58));
        assertEquals("MCMXCIV", IntegerToRoman.intToRoman(1994));
    }
}