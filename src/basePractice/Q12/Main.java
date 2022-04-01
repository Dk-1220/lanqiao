package basePractice.Q12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 给定n个十六进制正整数，输出它们对应的八进制数。
 */
public class Main {
    public static void main(String[] args) {

        List<String> arr = new ArrayList<>();
        String[] hex = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};

        // 输入个数
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 数据输入
        for (int i = 0; i < n; i++) {
            arr.add(sc.next());
        }

        for (String s : arr) {
            // 用来接收二进制串
            StringBuilder sb = new StringBuilder();
            // 用来接收八进制串
            StringBuilder output = new StringBuilder();
            // 16进制转2进制
            for (int i = 0; i < s.length(); i++) {
                int hexNum;
                char c = s.charAt(i);
                if (c >= 'A' && c <= 'Z') {
                    hexNum = c - 55;
                } else {
                    hexNum = c - 48;
                }

                sb.append(hex[hexNum]);
            }

            // 字符串长度补全为3的倍数（高位补0）
            sb.reverse();
            for (int j = 0; j < sb.length() % 3; j++) {
                sb.append(0);
            }
            sb.reverse();

            // 2进制转8进制
            int length = sb.length();
            for (int i = 0; i <= length - 3; i += 3) {
                // 每次截取3位二进制
                String str = sb.substring(i, i + 3);
                int octal = findOctalIndex(str);
                // 首位为0跳过
                if (i == 0 && octal == 0) {
                    continue;
                }
                output.append(octal);
            }
            System.out.println(output.toString());
        }
    }

    /**
     * 通过二进制（3位）找对应的八进制
     *
     * @param str
     * @return
     */
    public static int findOctalIndex(String str) {
        String[] octal = {"000", "001", "010", "011", "100", "101", "110", "111"};
        int index = 0;
        for (int i = 0; i < octal.length; i++) {
            if (str.equals(octal[i])) {
                index = i;
                break;
            }
        }
        return index;
    }
}