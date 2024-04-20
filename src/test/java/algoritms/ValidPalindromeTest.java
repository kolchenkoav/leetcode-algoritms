package algoritms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {
    @Test
    void isPalindrome() {
        assertEquals(true, ValidPalindrome.isPalindrome("abba"));
        assertEquals(true, ValidPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
        assertEquals(false, ValidPalindrome.isPalindrome("race a car"));
        assertEquals(true, ValidPalindrome.isPalindrome(" "));
    }
}