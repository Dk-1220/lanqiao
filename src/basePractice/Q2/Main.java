package basePractice.Q2;

/**
 * 问题描述
 * 对于长度为5位的一个01串，每一位都可能是0或1，一共有32种可能。它们的前几个是：
 * 00000
 * 00001
 * 00010
 * 00011
 * 00100
 * 请按从小到大的顺序输出这32种01串。
 * <p>
 * 输入格式
 * 本试题没有输入。
 * 输出格式
 * 输出32行，按从小到大的顺序每行一个长度为5的01串。
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 32; i++) {
            String binaryString = Integer.toBinaryString(i);
            int length = binaryString.length();
            if (length < 5) {
                StringBuilder sb = new StringBuilder(binaryString).reverse();
                int count = 5 - length;
                while ((count--) > 0) {
                    sb.append(0);
                }
                binaryString = sb.reverse().toString();
            }
            System.out.println(binaryString);
        }
    }
}
