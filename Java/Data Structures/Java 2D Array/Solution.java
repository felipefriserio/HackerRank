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
        int[][] array = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                array[i][j] = arrItem;
            }
        }
        scanner.close();

        System.out.println(getMaxHourglass(array));
    }

    static int getMaxHourglass(int[][] array) {
        int maxResult = Integer.MIN_VALUE;

        for (int row = 0; row < array.length - 2; row++) {
            for (int column = 0; column < array.length - 2; column++) {
                int sum = array[row + 0][column + 0]   + array[row + 0][column + 1]  + array[row + 0][column + 2] +
                        array[row + 1][column + 1]   +
                        array[row + 2][column + 0]   + array[row + 2][column + 1]  + array[row + 2][column + 2];
                maxResult = sum > maxResult ? sum : maxResult;
            }
        }
        return maxResult;
    }
}

