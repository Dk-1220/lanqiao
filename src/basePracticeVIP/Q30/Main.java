package basePracticeVIP.Q30;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 问题描述
 * 　　输入一个正整数n，输出n!的值。
 * 　　其中n!=1*2*3*…*n。
 * <p>
 * 算法描述
 * 　　n!可能很大，而计算机能表示的整数范围有限，需要使用高精度计算的方法。使用一个数组A来表示一个大整数a，A[0]表示a的个位，A[1]表示a的十位，依次类推。
 * 　　将a乘以一个整数k变为将数组A的每一个元素都乘以k，请注意处理相应的进位。
 * 　　首先将a设为1，然后乘2，乘3，当乘到n时，即得到了n!的值。
 * <p>
 * 输入格式
 * 　　输入包含一个正整数n，n<=1000。
 * <p>
 * 输出格式
 * 　　输出n!的准确值。
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        ArrayList A = calculating(n);
        StringBuilder str = new StringBuilder();
        for (int i = A.size() - 1; i >= 0; i--) {
            str.append(A.get(i));
        }
        System.out.print(str);
    }

    public static ArrayList calculating(int n) {
        ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(1);//首先将a设为1
        int highest = 1;//最高位数,比如999的最高位数为3
        for (int i = 2; i <= n; i++) {
            int carry = 0; //进位数，比如9+9，进位数为1
            int temp;
            for (int j = 0; j < highest; j++) {
                // 题目算法描述中说，将a乘以一个整数k变为将数组A的每一个元素都乘以k
                // A.get(j)是A数组位置为j的原有的数，你在乘以i之后，需要加上下一位的进位carry
                // 比如十位乘以i之后，得加上个位乘以i的进位
                // 例如987*3=2961，A=【7，8，9】，A.get(1)为位置为1的原有的数，它乘以3之后，需要加上7乘以3的进位2
                temp = A.get(j) * i + carry;
                // 取余数覆盖A数组中位置为j的元素
                // 例如987*3=2961，个位7乘以3之后，将1变为A数组新的个位，也就是覆盖0位置
                A.set(j, temp % 10);
                // 进位
                // 例如987*3=2961，个位7乘以3之后，进位carry为2
                carry = temp / 10;
            }
            // 当位数增加时，比如999*3=2997，它的最高位数就从3变成4，A数组就得增加新元素，长度增加
            while (carry != 0) {
                // 以999*3=2997为例，这里carry等于2，如果你奇怪这里为啥取余，
                // 那你想999*99=98901，这里的carry=98
                A.add(carry % 10);
                // 位数可能不只是增加了1，可能大于1，比如这里进位carry=98，
                // 位数就在999三位的基础上增加了两位，所以你得对carry进行整除，
                // 98/10等于9  8已经增加到A数组中了，9在下一次循环增加到A数组中
                carry = carry / 10;
                // 更新最高位数
                highest++;
            }
        }
        return A;
    }
}
