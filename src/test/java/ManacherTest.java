/**
 * Created by zfhuo on 9/24/17.
 */
import org.testng.annotations.*;
import static org.testng.Assert.*;
import string.Manacher;

public class ManacherTest {

    @Test
    public void testManacher() {
        assertEquals(3, Manacher.maxManacherSize("aba"));
        assertEquals(4, Manacher.maxManacherSize("abba"));
        assertEquals(0, Manacher.maxManacherSize(""));
        assertEquals(0, Manacher.maxManacherSize(null));
    }

    @Test
    public void testManacherDPSolution() {
        assertEquals(3, Manacher.maxManacherSizeDPSolution("aba"));
        assertEquals(4, Manacher.maxManacherSizeDPSolution("abba"));
        assertEquals(0, Manacher.maxManacherSizeDPSolution(""));
        assertEquals(0, Manacher.maxManacherSizeDPSolution(null));
    }
}
