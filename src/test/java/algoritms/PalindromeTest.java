package algoritms;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class PalindromeTest {
    @Test
    void isPalindrome1() {
        assertThat(Palindrome.isPalindrome(121)).isTrue();
    }

    @Test
    void isPalindrome2() {
        assertThat(Palindrome.isPalindrome(-121)).isFalse();
    }

    @Test
    void isPalindrome3() {
        assertThat(Palindrome.isPalindrome(10)).isFalse();
    }
}