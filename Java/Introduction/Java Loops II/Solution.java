import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        for (int i = 0; i < t; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();

            int result = 0;
            for (int j = 0; j < n; j++) {
                int aControl = j == 0 ? a : 0;
                result += aControl + (b * (int) Math.pow(2, j));
                System.out.print(result + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}
