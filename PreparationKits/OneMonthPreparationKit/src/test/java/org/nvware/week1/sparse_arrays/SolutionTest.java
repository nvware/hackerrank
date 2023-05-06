package org.nvware.week1.sparse_arrays;

import org.junit.Test;
import org.nvware.RedirectedOutputTest;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * @author <a href="mailto:nvware">Hamid Valizadegan</a>
 * Modified by <a href="mailto:nvware">Hamid Valizadegan</a>
 */
public class SolutionTest implements RedirectedOutputTest {
    @Test
    public void sampleTestCase0() {
        // Prepare test input
        String input = "4\n" +
                "aba\n" +
                "baba\n" +
                "aba\n" +
                "xzxb\n" +
                "3\n" +
                "aba\n" +
                "xzxb\n" +
                "ab\n";
        System.setIn(new ByteArrayInputStream(input.getBytes())); //set inputStream to system.in

        String expectedOutput = "2\n1\n0\n" + "\r\n"; // Insert expected output here
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
