import java.util.*;

public class Solution {
    private static int B;
    private static int H;
    private static boolean flag;

    static {
        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        H = scan.nextInt();
        scan.close();

        flag = (B <= 0 || H <= 0) ? false : true;
        if (!flag)
            System.out.println("java.lang.Exception: Breadth and height must be positive");
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }
}

