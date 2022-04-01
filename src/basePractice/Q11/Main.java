package basePractice.Q11;

import java.util.Scanner;

/**
 * 从键盘输入一个不超过8位的正的十六进制数字符串，将它转换为正的十进制数后输出。
 * 注：十六进制数中的10~15分别用大写的英文字母A、B、C、D、E、F表示。
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hexString = sc.next();

        hexString = new StringBuilder(hexString).reverse().toString();
        int output = 0;
        for (int i = 0; i < hexString.length(); i++) {
            int num = 0;
            char hexChar = hexString.charAt(i);
            if (hexChar >= 'A' && hexChar <= 'F') {
                num = hexChar - 55;
            } else {
                num = hexChar - 48;
            }
            output += (num * Math.pow(16, i));
        }
        System.out.println(output);
    }
}
