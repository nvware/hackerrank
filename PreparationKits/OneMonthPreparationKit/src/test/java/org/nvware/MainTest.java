package org.nvware;

import org.junit.Test;

/**
 * This class interacts with Solution to Test code objects.
 *
 * @author <a href="mailto:nvware">Hamid Valizadegan</a>
 * Modified by <a href="mailto:nvware">Hamid Valizadegan</a>
 * Extended to implements RedirectedOutputTest interface by Hamid Valizadegan nvware
 * Modified by <a href="nvware">Hamid Valizadegan</a> to work with output
 */
public final class MainTest implements RedirectedOutputTest {

    @Test
    public void sampleTestCase0() {
        String expectedOutput = "Hello world!\r\n";
        // Call main method
        testMainOutput(() -> Main.main(null), expectedOutput);

    }
}
