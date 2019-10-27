package chapter03.session2;

import java.util.Random;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;

/**
 * O(N)
 *
 * @author wangpp
 */
public class SimpleLoop {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = IntStream.generate(() -> random.nextInt(100)).limit(10).toArray();
        int max = findMax(array);
        System.out.println(max);
    }

    /**
     * @param arr
     * @return
     */
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = arr[i] > max ? arr[i] : max;
        }
        return max;
    }
}
