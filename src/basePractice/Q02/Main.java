package basePractice.Q02;

import java.util.Scanner;

/**
 * 问题描述
 * 求1+2+3+...+n的值。
 * <p>
 * 输入格式
 * 输入包括一个整数n。
 * <p>
 * 输出格式
 * 输出一行，包括一个整数，表示1+2+3+...+n的值。
 */
public class Main {
    public static void main(String[] args) {
        Long n = new Scanner(System.in).nextLong();
        Long output = 0L;

        output = (1 + n) * n / 2;
        System.out.println(output);
    }
}
