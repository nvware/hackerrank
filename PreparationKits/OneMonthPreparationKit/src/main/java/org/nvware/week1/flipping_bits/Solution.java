package org.nvware.week1.flipping_bits;

/**
 * @author <a href="mailto:nvware">Hamid Valizadegan</a>
 * Modified by <a href="mailto:nvware">Hamid Valizadegan</a>
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

class Result {

    /*
     * Complete the 'flippingBits' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static long flippingBits(long n) {
        // Write your code here
        return ~n & 0xFFFFFFFFL;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                long n = Long.parseLong(bufferedReader.readLine().trim());

                long result = Result.flippingBits(n);
                System.out.println(String.valueOf(result));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}
