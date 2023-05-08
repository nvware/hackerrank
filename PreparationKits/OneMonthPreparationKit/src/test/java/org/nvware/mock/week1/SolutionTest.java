package org.nvware.mock.week1;

import org.junit.Test;
import org.nvware.RedirectedOutputTest;


/**
 * @author <a href="mailto:nvware">Hamid Valizadegan</a>
 * Modified by <a href="mailto:nvware">Hamid Valizadegan</a>
 */
public class SolutionTest implements RedirectedOutputTest {
    @Test
    public void sampleTestCase() {
        String input ="15\n";
        String expectedOutput =
                "1\r\n" +
                        "2\r\n" +
                        "Fizz\r\n" +
                        "4\r\n" +
                        "Buzz\r\n" +
                        "Fizz\r\n" +
                        "7\r\n" +
                        "8\r\n" +
                        "Fizz\r\n" +
                        "Buzz\r\n" +
                        "11\r\n" +
                        "Fizz\r\n" +
                        "13\r\n" +
                        "14\r\n" +
                        "FizzBuzz\r\n";
        // Call main method
        runTestCase(input, expectedOutput, () -> {
            try {
                Solution.main(null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });


    }
}
