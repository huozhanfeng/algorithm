package dynamic;

/**
 * Created by zfhuo on 8/25/17.
 */
public class ClimbStair {
    public static void main(String[] args) {
        int n = 10; //stair

        int ki = 0;
        int kj = 0;
        int tmp = 0;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                ki = 1;
            } else if (i == 2) {
                kj = 2;
            } else if (i > 2) {
                tmp = kj;
                kj = ki + kj;
                ki = tmp;
            }
        }

        System.out.println(kj);
    }
}
