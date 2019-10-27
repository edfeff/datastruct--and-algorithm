package chapter03.session4;

/**
 * L is a sorted list containing n signed integers (n being big enough), for example [-5, -2, -1, 0, 1, 2, 4] (here, n
 * has a value of 7). If L is known to contain the integer 0, how can you find the index of 0 ?
 * <p>
 * 找0的位置
 *
 * @author wangpp
 */
public class FindZero {
    public static void main(String[] args) {
        int[] arr = new int[]{-5, -2, -1, 0, 1, 2, 4};
        System.out.println(oNSearch(arr, 0));
        System.out.println(binarySearch(arr, 0));
    }

    /**
     * O(N)search
     *
     * @param arr
     * @param key
     * @return
     */
    public static int oNSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int key) {
        for (int left = 0, right = arr.length - 1, mid = (left + right) >> 1; left <= right; ) {
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

}
