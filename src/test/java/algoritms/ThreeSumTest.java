package algoritms;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.HashSet;
import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {
    @Test
    void threeSum() {
        assertEquals(
                new HashSet<>(Arrays.asList(Arrays.asList(-1, -1, 2), Arrays.asList(-1, 0, 1))),
                new HashSet<>(ThreeSum.threeSum(new int[]{-1, 0, 1, 2, -1, -4}))
        );
        assertEquals(
                new HashSet<>(Arrays.asList()),
                new HashSet<>(ThreeSum.threeSum(new int[]{0, 1, 1}))
        );
        assertEquals(
                new HashSet<>(Arrays.asList(Arrays.asList(0, 0, 0))),
                new HashSet<>(ThreeSum.threeSum(new int[]{0, 0, 0}))
        );
    }
}