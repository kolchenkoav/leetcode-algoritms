package algoritms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

class LetterCombinationsOfAPhoneNumberTest {
    @Test
    void letterCombinations() {
        String digits1 = "23";
        List<String> expected1 = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        assertEquals(expected1, LetterCombinationsOfAPhoneNumber.letterCombinations(digits1));

        String digits2 = "";
        List<String> expected2 = Arrays.asList();
        assertEquals(expected2, LetterCombinationsOfAPhoneNumber.letterCombinations(digits2));

        String digits3 = "2";
        List<String> expected3 = Arrays.asList("a", "b", "c");
        assertEquals(expected3, LetterCombinationsOfAPhoneNumber.letterCombinations(digits3));
    }
}