import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int inputNumber = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 1; i <= 10; i++) {
            String stringCalc = getCalc(inputNumber, i);
            System.out.println(stringCalc);
        }

        scanner.close();
    }

    static String getCalc(int number, int factor){
        int calcResult = number * factor;
        return number + " x " + factor + " = " + calcResult;
    }
}