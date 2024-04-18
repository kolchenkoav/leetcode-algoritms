package algoritms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestPalindromicSubstringTest {
    @Test
    void longestPalindrome() {
        String result = LongestPalindromicSubstring.longestPalindrome("babad");
        Assertions.assertTrue(result.equals("bab") || result.equals("aba"), "Expected 'bab' or 'aba' but got " + result);
        Assertions.assertEquals("bb", LongestPalindromicSubstring.longestPalindrome("cbbd"));
        Assertions.assertEquals("a", LongestPalindromicSubstring.longestPalindrome("a"));
    }
}