package basePractice.Q03;

import java.util.Scanner;

/**
 * 问题描述
 * 给定圆的半径r，求圆的面积。
 * <p>
 * 输入格式
 * 输入包含一个整数r，表示圆的半径。
 * <p>
 * 输出格式
 * 输出一行，包含一个实数，四舍五入保留小数点后7位，表示圆的面积。
 */
public class Main {
    public static void main(String[] args) {
        int r = new Scanner(System.in).nextInt();
        double area = Math.PI * Math.pow(r, 2);
        System.out.println(String.format("%.7f", area));
    }
}
