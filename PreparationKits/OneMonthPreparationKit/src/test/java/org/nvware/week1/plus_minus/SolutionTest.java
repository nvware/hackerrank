package org.nvware.week1.plus_minus;

import org.junit.Test;
import org.nvware.RedirectedOutputTest;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author <a href="mailto:nvware">Hamid Valizadegan</a>
 * Modified by <a href="mailto:nvware">Hamid Valizadegan</a>
 */
public class SolutionTest implements RedirectedOutputTest {
    @Test
    public void sampleTestCase0() throws IOException {
        // Prepare test input
        String input = "6\n-4 3 -9 0 4 1\n";
        System.setIn(new ByteArrayInputStream(input.getBytes())); //set inputStream to system.in

        String expectedOutput = "0.500000\n" +
                "0.333333\n" +
                "0.166667\n"; // Insert expected output here
        // Call main method
        testMainOutput(() -> {
            try {
                Solution.main(null);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }, expectedOutput);

    }

    @Test
    public void sampleTestCase1() throws IOException {
        // Prepare test input
        String input = "8\n1 2 3 -1 -2 -3 0 0\n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        // Verify the output
        String expectedOutput = "0.375000\n" +
                "0.375000\n" +
                "0.250000\n";
        // Insert expected output here
        // Call main method
        testMainOutput(() -> {
            try {
                Solution.main(null);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }, expectedOutput);

    }
}
