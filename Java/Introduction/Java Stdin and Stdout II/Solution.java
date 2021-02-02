import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputInt = scan.nextInt();
        Double inputDouble = scan.nextDouble();
        scan.nextLine();
        String inputString = scan.nextLine();
        scan.close();

        System.out.println("String: " + inputString);
        System.out.println("Double: " + inputDouble);
        System.out.println("Int: " + inputInt);
    }
}