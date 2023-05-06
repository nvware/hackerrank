package org.nvware.week1.lonely_integer;

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
        // Prepare test input
        String input = "1\n1\n";
        String expectedOutput = "1\r\n"; // Insert expected output here
        runTestCase(input, expectedOutput, () -> {
            try {
                Solution.main(null);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    @Test
    public void sampleTestCase1() throws IOException {
        // Prepare test input
        String input = "3\n1 1 2\n";
        String expectedOutput = "2\r\n"; // Insert expected output here
        runTestCase(input, expectedOutput, () -> {
            try {
                Solution.main(null);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    @Test
    public void sampleTestCase2() throws IOException {
        // Prepare test input
        String input = "5\n0 0 1 2 1\n";
        String expectedOutput = "2\r\n"; // Insert expected output here
        runTestCase(input, expectedOutput, () -> {
            try {
                Solution.main(null);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

}