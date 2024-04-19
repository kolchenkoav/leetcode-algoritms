package algoritms;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class StringToIntegerTest {
    @Test
    void myAtoi() {
        assertThat(StringToInteger.myAtoi("42")).isEqualTo(42);
        assertThat(StringToInteger.myAtoi("   -42")).isEqualTo(-42);
        assertThat(StringToInteger.myAtoi("4193 with words")).isEqualTo(4193);
    }
}