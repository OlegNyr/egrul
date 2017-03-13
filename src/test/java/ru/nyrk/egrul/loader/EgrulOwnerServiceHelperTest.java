package ru.nyrk.egrul.loader;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

/**
 * todo:java doc
 */
public class EgrulOwnerServiceHelperTest {
    @Test
    public void testFormat() throws Exception {
        String format = String.format("%f%%", BigDecimal.TEN);
        assertEquals(format, "10,000000%");

    }

    @Test
    public void testFormatDelit() throws Exception {
        String format = String.format("%d/%d", BigInteger.ONE, BigInteger.TEN);
        assertEquals(format, "1/10");

    }
}