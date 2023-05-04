package org.nvware.week1.plus_minus;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.nvware.Main;
import org.nvware.RedirectedOutputTest;

import java.io.*;
/**
 * @author <a href="mailto:nvware">Hamid Valizadegan</a>
 * Modified by <a href="mailto:nvware">Hamid Valizadegan</a>
 */
public class SolutionTest implements RedirectedOutputTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(System.out);
    }

    @Test
    public void sampleTestCase0() {
        // Prepare test input
        String input = "6\n-4 3 -9 0 4 1\n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        String expectedOutput = "0.500000\n" +
                "0.333333\n" +
                "0.166667"; // Insert expected output here
        // Call main method
        testMainOutput(() -> Main.main(null), expectedOutput);

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
                "0.250000";
        // Insert expected output here
        // Call main method
        testMainOutput(() -> Main.main(null), expectedOutput);

    }
}
