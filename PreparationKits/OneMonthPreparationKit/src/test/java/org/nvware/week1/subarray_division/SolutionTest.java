package org.nvware.week1.subarray_division;

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
        String input = "5\n" +
                "1 2 1 3 2\n" +
                "3 2\n";
        String expectedOutput = "2\r\n";
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
