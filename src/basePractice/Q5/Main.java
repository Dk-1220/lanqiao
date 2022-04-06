package basePractice.Q5;

import java.util.Scanner;

/**
 * 问题描述
 * 给出一个包含n个整数的数列，问整数a在数列中的第一次出现是第几个。
 * <p>
 * 输入格式
 * 第一行包含一个整数n。
 * <p>
 * 第二行包含n个非负整数，为给定的数列，数列中的每个数都不大于10000。
 * <p>
 * 第三行包含一个整数a，为待查找的数。
 * <p>
 * 输出格式
 * 如果a在数列中出现了，输出它第一次出现的位置(位置从1开始编号)，否则输出-1。
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            data[i] = sc.nextInt();
        }

        int want = sc.nextInt();
        boolean flag = false;

        for (int i = 1; i <= n; i++) {
            if (data[i] == want) {
                System.out.println(i);
                flag = true;
                break;
            }
        }

        if (!flag) {
            System.out.println(-1);
        }
    }
}
