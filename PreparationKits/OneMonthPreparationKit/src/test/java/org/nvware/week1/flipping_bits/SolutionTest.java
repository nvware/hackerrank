package org.nvware.week1.flipping_bits;


import org.junit.Test;
import org.nvware.RedirectedOutputTest;

import java.io.IOException;

/**
 * @author <a href="mailto:nvware">Hamid Valizadegan</a>
 * Modified by <a href="mailto:nvware">Hamid Valizadegan</a>
 */
public class SolutionTest implements RedirectedOutputTest {
    @Test
    public void sampleTestCase0() throws IOException {
        String input = "3\n" +
                "2147483647\n" +
                "1\n" +
                "0\n";
        String expectedOutput = "2147483648\r\n" +
                "4294967294\r\n" +
                "4294967295\r\n";
        runTestCase(input, expectedOutput, () -> {
            try {
                Solution.main(null);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
