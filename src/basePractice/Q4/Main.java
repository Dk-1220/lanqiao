package basePractice.Q4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 问题描述
 * 给出n个数，找出这n个数的最大值，最小值，和。
 * <p>
 * 输入格式
 * 第一行为整数n，表示数的个数。
 * <p>
 * 第二行有n个数，为给定的n个数，每个数的绝对值都小于10000。
 * <p>
 * 输出格式
 * 输出三行，每行一个整数。第一行表示这些数中的最大值，第二行表示这些数中的最小值，第三行表示这些数的和。
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
            sum += data[i];
        }

        Arrays.sort(data);

        System.out.println(data[n - 1]);
        System.out.println(data[0]);
        System.out.println(sum);
    }
}
