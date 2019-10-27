package chapter03.session3;

import java.util.stream.IntStream;

/**
 * @author wangpp
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] array = IntStream.range(0, 100).toArray();
        System.out.println(binarySearch(array, 1));
        System.out.println(binarySearch(array, 100));
        System.out.println(binarySearch(array, 50));
        System.out.println(binarySearch(array, -1));
        System.out.println(binarySearch(array, 180));
    }

    /**
     * 二分搜索
     * O(lonN)
     *
     * @param arr
     * @param key
     * @return
     */
    public static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int index = (left + right) >> 1;
            if (arr[index] == key) {
                return index;
            } else if (arr[index] < key) {
                left = index + 1;
            } else {
                right = index - 1;
            }
        }
        return -1;
    }


}
