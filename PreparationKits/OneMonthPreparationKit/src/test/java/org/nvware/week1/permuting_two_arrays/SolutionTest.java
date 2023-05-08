package org.nvware.week1.permuting_two_arrays;

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
        String input = "2\n" +
                "3 10\n" +
                "2 1 3\n" +
                "7 8 9\n" +
                "4 5\n" +
                "1 2 2 1\n" +
                "3 3 3 4\n";
        String expectedOutput = "YES\r\n" +
                "NO\r\n";
        // Call main method
        runTestCase(input, expectedOutput, () -> {
            try {
                Solution.main(null);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

    }

}
