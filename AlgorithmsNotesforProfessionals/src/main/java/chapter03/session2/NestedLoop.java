package chapter03.session2;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * 检验数组中重复元素
 * O(N2)
 *
 * @author wangpp
 */
public class NestedLoop {

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = IntStream.generate(() -> random.nextInt(100)).limit(100).toArray();
        System.out.println(Arrays.toString(array));
        System.out.println(containsDuplicate2(array));

    }

    public static boolean containsDuplicate1(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    System.out.println(i + " " + j + " " + arr[i]);
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 改进版本
     *
     * @param arr
     * @return
     */
    public static boolean containsDuplicate2(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(i + " " + j + " " + arr[i]);
                    return true;
                }
            }
        }
        return false;
    }


}
