package io.dolan.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class MathHelperTest {

    @Test
    public void testGetSum() {
        assertEquals(6, MathHelper.getSum(3, 3));
    }

    @Test
    public void testMath() {
        MathHelper mathHelper = new MathHelper();
        assertNotNull(mathHelper);
    }

}