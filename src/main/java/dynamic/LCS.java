package dynamic;

import java.util.Arrays;

/**
 * Created by zfhuo on 8/27/17.
 */
public class LCS {
    public static void main(String[] args) {
        int[] a = {1,3,5,7,9,10};
        int[] b = {1,2,3,4,5,6,7,8,9};
        int m = a.length;
        int n = b.length;
        int[][] lcs = new int[m+1][n+1];
        for (int i = 0; i <= m; i++) {
            lcs[i][0] = 0;
        }
        for (int i = 0; i <= n; i++) {
            lcs[0][i] = 0;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if(a[i-1] == b[j-1]) {
                    lcs[i][j] = lcs[i-1][j-1] + 1;
                } else {
                    lcs[i][j] = Math.max(lcs[i-1][j], lcs[i][j-1]);
                }
            }
        }

        System.out.println(lcs[m][n]);
        for (int i = 0; i < lcs.length; i++) {
            System.out.println(Arrays.toString(lcs[i]));
        }


    }
}
