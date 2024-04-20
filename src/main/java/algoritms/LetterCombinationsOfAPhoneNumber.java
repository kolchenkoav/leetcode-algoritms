package algoritms;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 * 17. Letter Combinations of a Phone Number
 *
 *
 */
public class LetterCombinationsOfAPhoneNumber {
    private static final String[] LETTERS = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
    };
    public static List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }

        List<String> combinations = new ArrayList<>();
        backtrack(combinations, new StringBuilder(), digits, 0);
        return combinations;
    }

    private static void backtrack(List<String> combinations, StringBuilder prefix, String digits, int index) {
        if (index == digits.length()) {
            combinations.add(prefix.toString());
            return;
        }

        String letters = LETTERS[digits.charAt(index) - '0'];
        for (char letter : letters.toCharArray()) {
            prefix.append(letter);
            backtrack(combinations, prefix, digits, index + 1);
            prefix.deleteCharAt(prefix.length() - 1);
        }
    }
}
