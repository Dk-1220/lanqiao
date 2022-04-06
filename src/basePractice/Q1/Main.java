package basePractice.Q1;

import java.util.Scanner;

/**
 * 输入的第一行包括两个整数，由空格分隔，分别表示A、B。
 * 输出一行，包括一个整数，表示A+B的值。
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(x + y);
    }
}
