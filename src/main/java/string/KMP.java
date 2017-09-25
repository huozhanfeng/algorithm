package string;

import java.util.Arrays;

/**
 * Created by zfhuo on 9/24/17.
 */
public class KMP {

    public static int kmpSearch(String input, String pattern) {
        //ABCB
        //CB
        int[] next = getNextArray(pattern);
        System.out.println(Arrays.toString(next));
        char[] chi = input.toCharArray();
        char[] chp = pattern.toCharArray();
        int k = 0;
        int i = 0;
        while(i < chi.length) {
            if (chi[i] == chp[k]) {
                if (k == chp.length - 1) {
                    return i - (chp.length - 1);
                } else {
                    i++;
                    k++;
                }
            } else if (chi[i] != chp[k]) {
                if (k > 0) {
                    k = next[k -1];
                } else if (k == 0) {
                    i++;
                }
            }
        }
        return -1;
    }
    private static int[] getNextArray(String input){
        //ABCDABD   input
        //0000120   next
        //0123456   index
        if (input == null) {
            return null;
        }
        char[] chs = input.toCharArray();
        int[] next = new int[chs.length];
        for (int i = 1; i < chs.length; i++) {
            if(chs[i] == chs[next[i - 1]]) {
                next[i] = next[i - 1] + 1;
            } else {
                next[i] = 0;
            }
        }
        return next;
    }
    public static void main(String[] args) {
        String input = "BBC AABCDAB ABCDABCDABDE";
        String pattern = "ABCDABD";
        System.out.println(kmpSearch(input, pattern));
    }
}
