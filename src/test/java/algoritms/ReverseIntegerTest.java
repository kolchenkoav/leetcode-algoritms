package algoritms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {
    @Test
    void reverse() {
        assertEquals(321, ReverseInteger.reverse(123));
        assertEquals(-321, ReverseInteger.reverse(-123));
        assertEquals(21, ReverseInteger.reverse(120));
        assertEquals(0, ReverseInteger.reverse(0));
    }
}