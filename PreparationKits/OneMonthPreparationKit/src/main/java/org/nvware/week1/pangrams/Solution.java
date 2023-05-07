package org.nvware.week1.pangrams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

/**
 * @author <a href="mailto:nvware">Hamid Valizadegan</a>
 * Modified by <a href="mailto:nvware">Hamid Valizadegan</a>
 */

class Result {

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
        // Write your code here
        String lowerS = s.replaceAll("\\s", "").toLowerCase();

        int size = lowerS.chars().filter(Character::isAlphabetic).distinct().mapToObj(c -> (char) c).collect(Collectors.toList()).size();
        if (size == 26) {
            return "pangram";
        } else {
            return "not pangram";
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        System.out.println(result);

        bufferedReader.close();
    }
}
