package org.nvware;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public interface RedirectedOutputTest {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    public default void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    public default void restoreStreams() {
        System.setOut(originalOut);
    }

    public default String getOutput() {
        return outContent.toString();
    }

    public default void testMainOutput(Runnable mainMethod, String expectedOutput) {
        setUpStreams(); // Redirect output to a ByteArrayOutputStream

        // Call main method
        mainMethod.run();

        // Verify the output
        String result = "";
        try {
            assertEquals(expectedOutput, getOutput());
            result = "Test passed!";// Print out a message indicating that the test has passed
        } catch (AssertionError e) {
            result = "Wrong Answer :(";
        } finally {
            restoreStreams();// Restore the original System.out
            System.out.println("testMainOutput");
            System.out.println(result);
        }
    }
}
