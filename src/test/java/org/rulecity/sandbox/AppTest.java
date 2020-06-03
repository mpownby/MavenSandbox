package org.rulecity.sandbox;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        App instance = new App();

        int result = instance.multiply(5, 6);

        assertEquals(30, result);
    }
}
