package basePracticeVIP.Q29;

import java.util.Scanner;

/**
 * 输入两个整数a和b，输出这两个整数的和。a和b都不超过100位。
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        a = new StringBuilder(a).reverse().toString();
        b = new StringBuilder(b).reverse().toString();

        String max;
        String min;

        if (a.length() >= b.length()) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }

        int jinwei = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < min.length(); i++) {

            int sum = a.charAt(i) + b.charAt(i) - 96 + jinwei;
            jinwei = sum / 10;
            sb.append(sum % 10);
        }

        for (int i = min.length(); i < max.length(); i++) {
            int sum = max.charAt(i) - 48 + jinwei;
            jinwei = sum / 10;
            sb.append(sum % 10);
        }

        if (jinwei > 0) {
            sb.append(jinwei);
        }

        String result = sb.reverse().toString();
        System.out.println(result);
    }
}