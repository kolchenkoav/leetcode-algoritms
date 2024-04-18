package algoritms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MedianOfTwoSortedArraysTest {
    @Test
    void findMedianSortedArrays() {
        Assertions.assertEquals(2.0, MedianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
        Assertions.assertEquals(2.5, MedianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }
}