package algoritms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestCommonPrefixTest {
    @Test
    void longestCommonPrefix() {
        assertEquals("fl", LongestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        assertEquals("", LongestCommonPrefix.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }
}