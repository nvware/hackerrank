package org.nvware;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author <a href="mailto:nvware">Hamid Valizadegan</a>
 * Modified by <a href="mailto:nvware">Hamid Valizadegan</a>
 */

class Result {

    /*
     * Complete the 'sayMessage' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */
    public static String sayHello(String name) {
        // Write your code here
        return "Hello " + name + "!";

    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();

        String result = org.nvware.Result.sayHello(s);
        System.out.println(result);

        bufferedReader.close();
    }
}
