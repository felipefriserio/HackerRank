import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.*;

import java.io.*;
import java.util.*;


public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main (String[] args) {
        int rows = scan.nextInt();

        List<List<Integer>> rowList = new ArrayList();
        for (int i = 0; i < rows; i++) {
            int rowLength = scan.nextInt();
            ArrayList<Integer> row = new ArrayList<>();

            for (int j = 0; j < rowLength; j++) {
                row.add(scan.nextInt());
            }

            rowList.add(row);
        }

        int nPositions = scan.nextInt();
        for (int i = 0; i < nPositions; i++) {
            int row    = scan.nextInt();
            int column = scan.nextInt();

            try {
                int value = rowList.get(row - 1)
                                   .get(column - 1);
                System.out.println(value);
            } catch (IndexOutOfBoundsException e){
                System.out.println("ERROR!");
            }
        }
    }
}