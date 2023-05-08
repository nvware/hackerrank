package org.nvware.week1.xor_strings;

import org.junit.Test;
import org.nvware.RedirectedOutputTest;

import java.io.IOException;

/**
 * @author <a href="mailto:nvware">Hamid Valizadegan</a>
 * Modified by <a href="mailto:nvware">Hamid Valizadegan</a>
 */
public class SolutionTest implements RedirectedOutputTest {
    @Test
    public void sampleTestCase0() {
        String input = "10101\n" +
                "00101\n";
        String expectedOutput = "10000\r\n";
        // Call main method
        runTestCase(input, expectedOutput, () -> {
            try {
                Solution.main(null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

    }
}
