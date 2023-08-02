import org.junit.Assert;
import org.junit.Test;

public class GCDTest {
    @Test
    public void gcdTest1() {
        int expected = 34;
        int p = 102, q = 68;
        int actual = RecursiveMath.greatestCommonDivisor(p, q);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void gcdTest2() {
        int expected = 34;
        int p = 102, q = 68;
        int actual = RecursiveMath.greatestCommonDivisor(q, p);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void gcdTest3() {
        int expected = 526;
        int p = 24826148, q = 45296490;
        int actual = RecursiveMath.greatestCommonDivisor(q, p);
        Assert.assertEquals(expected, actual);
    }
}
