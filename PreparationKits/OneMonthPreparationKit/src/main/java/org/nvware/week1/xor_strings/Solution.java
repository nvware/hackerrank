package org.nvware.week1.xor_strings;

/**
 * @author <a href="mailto:nvware">Hamid Valizadegan</a>
 * Modified by <a href="mailto:nvware">Hamid Valizadegan</a>
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Result {

    public static String strings_xor(String s, String t) {
        BigInteger s1 = new BigInteger(s, 2); // Convert string to BigInteger
        BigInteger t1 = new BigInteger(t, 2); // Convert string to BigInteger

        return s1.xor(t1).toString(2);// Perform XOR operation then Convert result back to binary string
    }
}
public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        String t = bufferedReader.readLine();
        System.out.println(Result.strings_xor(s,t));
        bufferedReader.close();
    }
}