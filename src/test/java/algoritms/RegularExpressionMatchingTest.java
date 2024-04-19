package algoritms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RegularExpressionMatchingTest {

    @Test
    void isMatch() {
        assertEquals(false, RegularExpressionMatching.isMatch("aa", "a")); // aa
        assertEquals(true, RegularExpressionMatching.isMatch("aa", "a*")); // aa*
        assertEquals(true, RegularExpressionMatching.isMatch("ab", ".*")); // ab
        assertEquals(true, RegularExpressionMatching.isMatch("aab", "c*a*b")); // aab
    }
}