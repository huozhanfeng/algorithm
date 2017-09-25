package dynamic;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

/**
 * Created by zfhuo on 8/25/17.
 */
public class Gold {

    public static void main(String[] args) {
        int[] gold = {400, 500, 200, 300, 350};
        int[] per = {5, 5, 3, 4, 3};
        int n = 5;
        int p = 10;

        int[][] lcs = new int[n+1][p + 1];
        for (int i = 0; i <= n; i++) {
            lcs[i][0] = 0;
        }
        for (int i = 0; i <= p; i++) {
            lcs[0][i] = 0;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= p; j++) {
                if (j - per[i-1] < 0) {
                    lcs[i][j] = lcs[i-1][j];
                } else {
                    lcs[i][j] = Math.max(lcs[i-1][j], lcs[i-1][j-per[i-1]] + gold[i-1]);
                }
            }
        }
        System.out.println(lcs[5][10]);
        for (int i = 0; i < lcs.length; i++) {
            System.out.println(Arrays.toString(lcs[i]));
        }

        /*int[] preResult = new int[p];
        int[] result = new int[p];

        for (int i = 0; i < p; i++) {
            if (i + 1 < per[0]) {
                preResult[i] = 0;
            } else {
                preResult[i] = gold[0];
            }
        }

        if (n == 0) {
            System.out.println(preResult[p - 1]);
            return;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < p; j++) {
                if (j + 1 - per[i] <= 0) {
                    result[j] = preResult[j];
                } else {
                    result[j] = Math.max(preResult[j], preResult[j-per[i]] + gold[i]);
                }
            }
            preResult = result;
            result = new int[p];
        }
        System.out.println(preResult[p - 1]);*/
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        map.put(1,1);
        map.put(2,2);
        for (Integer integer : map.keySet()) {
            System.out.println(integer);
        }
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.poll();
    }
}
