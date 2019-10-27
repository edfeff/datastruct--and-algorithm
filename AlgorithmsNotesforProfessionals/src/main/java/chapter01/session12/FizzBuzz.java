package chapter01.session12;

import java.util.stream.IntStream;

/**
 * Fizz Buzz
 * You may have seen Fizz Buzz written as Fizz Buzz, FizzBuzz, or Fizz-Buzz; they're all referring to the same thing. That
 * "thing" is the main topic of discussion today. First, what is FizzBuzz?
 * This is a common question that comes up in job interviews.
 * <p>
 * Fizz and Buzz refer to any number that's a multiple of 3 and 5 respectively. In other words, if a number is divisible
 * by 3, it is substituted with fizz; if a number is divisible by 5, it is substituted with buzz. If a number is simultaneously
 * a multiple of 3 AND 5, the number is replaced with "fizz buzz." In essence, it emulates the famous children game
 * "fizz buzz".
 * <p>
 * 被3整除为fizz
 * 被5整除为buzz
 * 同时被3和5整除就是FizzBuzz
 *
 * @author wangpp
 */
public class FizzBuzz {
    public static void main(String[] args) {
        int[] arr = IntStream.range(1, 16).toArray();
        solution1(arr);
        solution2(arr);
    }

    /**
     * 遍历解法
     *
     * @param arr
     */
    private static void solution1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0 && arr[i] % 5 == 0) {
                System.out.printf("%d fizz buzz\n", arr[i]);
            } else if (arr[i] % 3 == 0) {
                System.out.printf("%d fizz\n", arr[i]);
            } else if (arr[i] % 5 == 0) {
                System.out.printf("%d buzz\n", arr[i]);
            } else {
                System.out.printf("%d\n", arr[i]);
            }
        }
    }

    /**
     * 第二种解法，将 3和5的结果作为除数
     *
     * @param arr
     */
    private static void solution2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 15 == 0) {
                System.out.printf("%d fizz buzz\n", arr[i]);
            } else if (arr[i] % 3 == 0) {
                System.out.printf("%d fizz\n", arr[i]);
            } else if (arr[i] % 5 == 0) {
                System.out.printf("%d buzz\n", arr[i]);
            } else {
                System.out.printf("%d\n", arr[i]);
            }
        }
    }
}
