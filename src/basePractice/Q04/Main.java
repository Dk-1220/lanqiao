package basePractice.Q04;

import java.util.Scanner;

/**
 * 问题描述
 * Fibonacci数列的递推公式为：Fn=Fn-1+Fn-2，其中F1=F2=1。
 * 当n比较大时，Fn也非常大，现在我们想知道，Fn除以10007的余数是多少。
 * <p>
 * 输入格式
 * 输入包含一个整数n。
 * <p>
 * 输出格式
 * 输出一行，包含一个整数，表示Fn除以10007的余数。
 */
public class Main {
    public static void main(String[] args) {
        int[] a = new int[10000001];
        a[1] = 1;
        a[2] = 1;
        int n = new Scanner(System.in).nextInt();
        for (int i = 3; i <= n; i++) {
            a[i] = (a[i - 1] + a[i - 2]) % 10007;
        }
        System.out.println(a[n]);
    }
}
