package org.nvware.week1.mini_max_sum;

import org.junit.Test;
import org.nvware.Main;
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
        String input = "1 2 3 4 5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes())); //set inputStream to system.in

        String expectedOutput = "10 14\r\n"; // Insert expected output here
        // Call main method
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
        String input = "7 69 2 221 8974\n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        String expectedOutput = "299 9271\r\n"; // Insert expected output here
        // Call main method
        runTestCase(input, expectedOutput, () -> {
            try {
                Solution.main(null);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });


    }

    @Test
    public void testCase1() throws IOException {
        // Prepare test input
        String input = "256741038 623958417 467905213 714532089 938071625\n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        String expectedOutput = "2063136757 2744467344\r\n"; // Insert expected output here
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
