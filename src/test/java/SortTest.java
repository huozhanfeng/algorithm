/**
 * Created by zfhuo on 9/24/17.
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import sort.Sort;

public class SortTest {
    HashMap<int[], int[]> tests = new HashMap();
    @BeforeMethod
    public void setUp() {
        int[] input = new int[]{1, 4, 3, 2, 6, 5, 10, 7, 8, 9};
        int[] result = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        tests.put(input, result);

        tests.put(null, null);
        tests.put(new int[]{1}, new int[]{1});
    }

    @org.testng.annotations.Test
    public void testBubblingSort() {
        for (Map.Entry<int[], int[]> entry : tests.entrySet()) {
            Sort.bubblingSort(entry.getKey());
            assertTrue(Arrays.equals(entry.getKey(), entry.getValue()));
        }
    }

    @org.testng.annotations.Test
    public void testSelectSort() {
        for (Map.Entry<int[], int[]> entry : tests.entrySet()) {
            Sort.selectSort(entry.getKey());
            assertTrue(Arrays.equals(entry.getKey(), entry.getValue()));
        }
    }

    @org.testng.annotations.Test
    public void testInsertSort() {
        for (Map.Entry<int[], int[]> entry : tests.entrySet()) {
            Sort.insertSort(entry.getKey());
            assertTrue(Arrays.equals(entry.getKey(), entry.getValue()));
        }
    }

    @org.testng.annotations.Test
    public void testMergeSort() {
        for (Map.Entry<int[], int[]> entry : tests.entrySet()) {
            Sort.mergeSort(entry.getKey());
            assertTrue(Arrays.equals(entry.getKey(), entry.getValue()));
        }
    }

    @org.testng.annotations.Test
    public void testQuickSort() {
        for (Map.Entry<int[], int[]> entry : tests.entrySet()) {
            Sort.quickSort(entry.getKey());
            assertTrue(Arrays.equals(entry.getKey(), entry.getValue()));
        }
    }

    @AfterClass
    public void stop() {
        System.out.println("end");
    }
}
