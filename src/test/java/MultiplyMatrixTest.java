/**
 * Created by zfhuo on 9/24/17.
 */
import basic.MultiplyMatrix;
import java.util.Arrays;
import org.testng.annotations.*;
import static org.testng.Assert.*;
public class MultiplyMatrixTest {
    @Test
    public void testMultiplyMatrix() {
        int[][] a = {{1,2}, {3,4}, {5,6}};
        int[][] b = {{1,2,3}, {4,5,6}};
        int[][] result = {{9, 12, 15}, {19, 26, 33}, {29, 40, 51}};
        assertTrue(Arrays.deepEquals(MultiplyMatrix.multiplyMatrix(a, b), result));

        a = null;
        b = new int[][]{{1,2,3}, {4,5,6}};
        assertTrue(Arrays.deepEquals(MultiplyMatrix.multiplyMatrix(a, b), null));

        a = new int[][]{{3,4,5}, {5,6,7}};
        b = new int[][]{{1,2,3}, {4,5,6}};
        assertTrue(Arrays.deepEquals(MultiplyMatrix.multiplyMatrix(a, b), null));
    }
}
