import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void factorialOf1() {
        long expected = 1;
        long n = 1;
        long actual = RecursiveMath.factorial(n);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void factorialOf5() {
        long expected = 5*4*3*2*1;
        long n = 5;
        long actual = RecursiveMath.factorial(n);
        Assert.assertEquals(expected, actual);
    }
}