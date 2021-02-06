import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        while (sc.hasNextLine()) {
            String text = sc.nextLine();
            System.out.println(i + " " + text);
            i++;
        }
    }
}
