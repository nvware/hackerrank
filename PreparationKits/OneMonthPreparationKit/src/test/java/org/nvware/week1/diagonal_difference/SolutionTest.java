package org.nvware.week1.diagonal_difference;

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
                "11 2 4\n" +
                "4 5 6\n" +
                "10 8 -12\n";
        String expectedOutput = "15\r\n";
        runTestCase(input, expectedOutput, () -> {
            try {
                Solution.main(null);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
