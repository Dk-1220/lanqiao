package basePractice.Q7;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            int z = i % 10;
            int y = i / 10 % 10;
            int x = i / 100;

            if (x * x * x + y * y * y + z * z * z == i) {
                System.out.println(i);
            }
        }
    }
}
