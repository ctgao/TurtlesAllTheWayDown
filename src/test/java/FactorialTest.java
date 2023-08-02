import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void factorialOf1() {
        int expected = 1;
        int n = 1;
        int actual = RecursiveMath.factorial(n);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void factorialOf5() {
        int expected = 5*4*3*2*1;
        int n = 5;
        int actual = RecursiveMath.factorial(n);
        Assert.assertEquals(expected, actual);
    }
}