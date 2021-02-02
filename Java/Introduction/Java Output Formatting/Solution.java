import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String text = sc.next();
            int value = sc.nextInt();

            String space = calculateSpace(text,15);
            String formattedValue = formatValue(value+"", 3);

            System.out.println(text + space + formattedValue);
        }
        System.out.println("================================");

    }

    static String calculateSpace(String text, int spaceValue){
        StringBuilder sb = new StringBuilder();
        int result = spaceValue - text.length();

        for (int i = result; i > 0; i--){
            sb.append(" ");
        }

        return sb.toString();
    }

    static String formatValue(String inputString, int length) {
        if (inputString.length() >= length) {
            return inputString;
        }
        StringBuilder sb = new StringBuilder();
        while (sb.length() < length - inputString.length()) {
            sb.append('0');
        }
        sb.append(inputString);

        return sb.toString();
    }
}
