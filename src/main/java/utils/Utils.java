package utils;

/**
 * Created by zfhuo on 9/24/17.
 */
public class Utils {
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
