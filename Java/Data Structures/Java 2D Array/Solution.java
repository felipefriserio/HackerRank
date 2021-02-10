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
        int maxResult = 0;

        for (int x = 0; x < array.length - 2; x++) {
            int sum = 0;
            for (int y = 0; y < array.length - 2; y++) {
                sum = array[x][y]   + array[x+1][y]   + array[x+2][y] +
                                      array[x+1][y+1] +
                      array[x][y+2] + array[x+1][y+2] + array[x+2][y+2];
                maxResult = sum > maxResult ? sum : maxResult;
            }
        }
        return maxResult;
    }
}
