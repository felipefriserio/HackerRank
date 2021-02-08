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

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale indianLocale       = new Locale("en", "IN");
        NumberFormat usFormat     = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaFormat  = NumberFormat.getCurrencyInstance(indianLocale);
        NumberFormat chinaFormat  = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        String usFormatted      = usFormat.format(payment);
        String indiaFormatted   = indiaFormat.format(payment);
        String chinaFormatted   = chinaFormat.format(payment);
        String franceFormatted  = franceFormat.format(payment);

        System.out.println("US: "     + usFormatted);
        System.out.println("India: "  + indiaFormatted);
        System.out.println("China: "  + chinaFormatted);
        System.out.println("France: " + franceFormatted);
    }
}
