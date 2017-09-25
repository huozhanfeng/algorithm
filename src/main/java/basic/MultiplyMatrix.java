package basic;

import java.util.Arrays;

/**
 * Created by zfhuo on 8/27/17.
 */
public class MultiplyMatrix {
    public static int[][] multiplyMatrix(int[][] a, int[][] b) {
        if (a != null && b != null && a.length > 0 && a[0].length == b.length) {
            int[][] ab = new int[a.length][a.length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    int sum = 0;
                    for (int k = 0; k < a[i].length; k++) {
                        sum += a[i][k] * b[k][j];
                    }
                    ab[i][j] = sum;
                }
            }
            return ab;
        }
        return null;//or throw exception
    }

    public static void main(String[] args) {
        int[][] a = {{1,2}, {3,4}, {5,6}};
        int[][] b = {{1,2,3}, {4,5,6}};
        int[][] ab = multiplyMatrix(a, b);

        for (int i = 0; i < ab.length; i++) {
            System.out.println(Arrays.toString(ab[i]));
        }
    }
}
