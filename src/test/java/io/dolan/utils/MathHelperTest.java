package io.dolan.utils;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class MathHelperTest {

    @Test
    public void testGetSum() {
        assertEquals(6, MathHelper.getSum(3, 3));
    }

    @Test
    public void testGetProduct() {
        assertEquals(6, MathHelper.getProduct(2,3));
    }

    @Test
    public void testMath() {
        MathHelper mathHelper = new MathHelper();
        assertNotNull(mathHelper);
    }

}