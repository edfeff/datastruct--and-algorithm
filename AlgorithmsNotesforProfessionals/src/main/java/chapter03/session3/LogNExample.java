package chapter03.session3;

/**
 * O(logN)
 *
 * @author wangpp
 */
public class LogNExample {
    public static void main(String[] args) {
        int n = 256;
        for (int i = 1; i <= n; i *= 2) {
            System.out.println(i);
        }
    }
}
