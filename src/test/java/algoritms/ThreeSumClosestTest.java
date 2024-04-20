package algoritms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ThreeSumClosestTest {
    @Test
    void threeSumClosest() {
        assertEquals(2, ThreeSumClosest.threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
        assertEquals(0, ThreeSumClosest.threeSumClosest(new int[]{0, 0, 0}, 1));
    }
}