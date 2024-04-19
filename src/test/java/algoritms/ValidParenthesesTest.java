package algoritms;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class ValidParenthesesTest {
    @Test
    void isValid() {
        assertThat(ValidParentheses.isValid("()")).isTrue();
        assertThat(ValidParentheses.isValid("()[]{}")).isTrue();
        assertThat(ValidParentheses.isValid("(]")).isFalse();
        assertThat(ValidParentheses.isValid("([)]")).isFalse();
    }
}