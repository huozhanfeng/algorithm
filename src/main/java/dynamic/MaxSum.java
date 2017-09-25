package dynamic;

/**
 * Created by zfhuo on 8/27/17.
 */
public class MaxSum {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 10, -4, 7, 2, -5};
        int[] sum = new int[arr.length];

        sum[0] = arr[0];
        for (int i = 1; i < sum.length; i++) {
            sum[i] = Math.max(sum[i-1] + arr[i], arr[i]);
        }
        for (int i = 0; i < sum.length; i++) {
            System.out.println(sum[i]);
        }
    }
}
