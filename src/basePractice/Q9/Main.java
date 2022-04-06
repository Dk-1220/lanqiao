package basePractice.Q9;

import java.util.Scanner;

/**
 * 123321是一个非常特殊的数，它从左边读和从右边读是一样的。
 * 输入一个正整数n， 编程求所有这样的五位和六位十进制数，满足各位数字之和等于n 。
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();

        // 偶数
        if (sum % 2 == 0) {
            // 五位数
            for (int x = 1; x <= 9; x++) {
                for (int y = 0; y <= 9; y++) {
                    for (int z = 0; z <= 8; z += 2) {
                        if (2 * (x + y) + z == sum) {
                            System.out.println("" + x + y + z + y + x);
                        }
                    }
                }
            }
            // 六位数
            for (int x = 1; x <= 9; x++) {
                for (int y = 0; y <= 9; y++) {
                    for (int z = 0; z <= 9; z++) {
                        if (2 * (x + y + z) == sum) {
                            System.out.println("" + x + y + z + z + y + x);
                        }
                    }
                }
            }
        } else {
            // 奇数且是五位数
            for (int x = 1; x <= 9; x++) {
                for (int y = 0; y <= 9; y++) {
                    for (int z = 1; z <= 9; z += 2) {
                        if (2 * (x + y) + z == sum) {
                            System.out.println("" + x + y + z + y + x);
                        }
                    }
                }
            }
        }
    }
}
