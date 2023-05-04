package org.nvware.week1.plus_minus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @author <a href="mailto:nvware">Hamid Valizadegan</a>
 * Modified by <a href="mailto:nvware">Hamid Valizadegan</a>
 */
class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int n = arr.size();
        long positives = arr.stream().filter(x -> x > 0).count();
        long negatives = arr.stream().filter(x -> x < 0).count();
        long zeros = arr.stream().filter(x -> x == 0).count();
        double ratioOFPositive = (double) positives / n;
        double ratioOFNegative = (double) negatives / n;
        double ratioOFZero = (double) zeros / n;

        System.out.printf("%.6f\n", ratioOFPositive);
        System.out.printf("%.6f\n", ratioOFNegative);
        System.out.printf("%.6f\n", ratioOFZero);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
