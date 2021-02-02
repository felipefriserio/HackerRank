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
        int inputNumber = scan.nextInt();
        scan.close();

        if (inputNumber > 100)
            throw new IllegalArgumentException("InputNumber can not be higher than 100. value= " + inputNumber );

        String result = "";
        if (!isEven(inputNumber))
            result = "Weird";
        else if (inputNumber >= 2 && inputNumber <= 5)
            result = "Not Weird";
        else if (inputNumber >= 6 && inputNumber <= 20)
            result = "Weird";
        else if (inputNumber > 20)
            result = "Not Weird";

        System.out.println(result);
    }

    static boolean isEven(int number){
        return number % 2 == 0;
    }
}
