package org.nvware;

/**
 * @author <a href="mailto:nvware">Hamid Valizadegan</a>
 * Modified by <a href="mailto:nvware">Hamid Valizadegan</a>
 */

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * @author <a href="mailto:nvware">Hamid Valizadegan</a>
 * Modified by <a href="mailto:nvware">Hamid Valizadegan</a>
 */
public class SolutionTest implements RedirectedOutputTest {
    @Test
    public void sampleTestCase0() throws IOException {
        // Prepare test input
        String input = "World\n";
        System.setIn(new ByteArrayInputStream(input.getBytes())); //set inputStream to system.in

        String expectedOutput = "Hello World!\r\n"; // Insert expected output here
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
