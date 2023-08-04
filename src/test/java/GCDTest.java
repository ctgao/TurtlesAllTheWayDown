import org.junit.Assert;
import org.junit.Test;

public class GCDTest {
    @Test
    public void gcdTest1() {
        long expected = 34;
        long p = 102, q = 68;
        long actual = RecursiveMath.greatestCommonDivisor(p, q);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void gcdTest2() {
        long expected = 34;
        long p = 102, q = 68;
        long actual = RecursiveMath.greatestCommonDivisor(q, p);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void gcdTest3() {
        long expected = 526;
        long p = 24826148, q = 45296490;
        long actual = RecursiveMath.greatestCommonDivisor(q, p);
        Assert.assertEquals(expected, actual);
    }
}
