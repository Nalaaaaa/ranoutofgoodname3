import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FinderTest {
    int[] intArray = new int[]{10,20,100};

    int[] emptyArray = new int[0];

    int[] nullArray = null;

    @Test
    void testMax() {
        assertEquals(100, finder.findMax(intArray));
    }

    @Test
    void testMaxEmpty() {
        assertNull(finder.findMax(emptyArray));
    }

    @Test
    void testMaxNull() {
        assertNull(finder.findMax(nullArray));
    }

    @Test
    void testMin() {
        assertEquals(10, finder.findMin(intArray));
    }

    @Test
    void testMinEmpty() {
        assertNull(finder.findMin(emptyArray));
    }

    @Test
    void testMinNull() {
        assertNull(finder.findMin(nullArray));
    }


}