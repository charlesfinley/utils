package io.dolan.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class MathTest {

    @Test
    public void testGetSum() {
        assertEquals(6, Math.getSum(3, 3));
    }

    @Test
    public void testMath() {
        Math math = new Math();
        assertNotNull(math);
    }

}