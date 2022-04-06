package basePractice.Q13;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 输入格式
 * 　　第一行为一个整数n。
 * 　　第二行包含n个整数，为待排序的数，每个整数的绝对值小于10000。
 * 输出格式
 * 　　输出一行，按从小到大的顺序输出排序后的数列。
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] data = new int[num];

        for (int i = 0; i < num; i++) {
            data[i] = sc.nextInt();
        }

        Arrays.sort(data);

        for (int i = 0; i < num; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
