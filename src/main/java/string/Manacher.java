package string;

/**
 * Created by zfhuo on 9/24/17.
 */
public class Manacher {

    public static int maxManacherSize(String str) {
        int result = 0;
        if (null == str || str.length() == 0) {
            return result;
        }

        char[] chs = prepare(str);
        int[] rl = new int[chs.length];
        int index = 0;
        int maxRight = 0;
        rl[0] = 1;

        //#1#
        //#1#1#
        for (int i = 0; i < chs.length; i++) {
            if(i < maxRight) {
                rl[i] = Math.min(rl[2 * index - i], maxRight - i);
            } else if (i >= maxRight) {
                rl[i] = 1;
            }

            while(i - rl[i] >= 0 && i + rl[i] <= chs.length - 1 && chs[i + rl[i]] == chs[i - rl[i]]) {
                rl[i]++;
            }

            if (i + (rl[i] - 1) > maxRight) {
                index = i;
                maxRight = i + (rl[i] - 1);
            }
        }

        for (int i = 0; i < rl.length; i++) {
            if (rl[i] > result) {
                result = rl[i];
            }
        }

        return result - 1;
    }

    public static int maxManacherSizeDPSolution(String str) {
        int result = 0;
        if (null == str || str.length() == 0) {
            return result;
        }

        char[] chs = str.toCharArray();
        boolean[][] isManacher = new boolean[chs.length][chs.length];  //代表chs[i]~chs[j]是不是回文
        isManacher[0][0] = true;
        //1, 每个字符分别作为子字符串结尾
        //1, 确定一个结尾符号之后,从该字符串往前递推起始点,并计算每次递推时是否是回文
        for (int i = 0; i < chs.length; i++) { //子字符串结尾
            for (int j = i; j >=0 ; j--) { //子字符串起始
                if (chs[i] == chs[j] && (i - j < 2 || isManacher[i - 1][j + 1])) {
                    isManacher[i][j] = true;
                    result = Math.max(i - j + 1, result);
                }
            }
        }

        return result;
    }
    private static char[] prepare(String str) {
        char[] input = str.toCharArray();
        char[] result = new char[2 * input.length + 1];
        int k = 0;
        for (int i = 0; i < input.length; i++) {
            result[k++] = '#';
            result[k++] = input[i];
        }
        result[k++] = '#';
        return result;
    }

    public static void main(String[] args) {
        System.out.println(maxManacherSize("abcba"));
    }
}
