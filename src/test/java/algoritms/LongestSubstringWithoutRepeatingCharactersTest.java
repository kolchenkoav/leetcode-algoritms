package algoritms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    public void lengthOfLongestSubstring() {
        Assertions.assertEquals(3, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb"));
        Assertions.assertEquals(1, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("bbbbb"));
        Assertions.assertEquals(3, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew"));
    }
}