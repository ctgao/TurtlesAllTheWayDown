//package PACKAGE_NAME;

import java.time.Duration;
import java.time.Instant;

/**
 * Created by kristofer on 7/14/20.
 */
public class Turtles {
    public static void main(String[] args){
        int p = 24826148, q = 45296490;

        Instant start = Instant.now();
        RecursiveMath.greatestCommonDivisor(p, q);
        Instant finish = Instant.now();
        long gcdTiming = Duration.between(start, finish).toNanos();

        Instant start2 = Instant.now();
        RecursiveMath.gcd2(p, q);
        Instant finish2 = Instant.now();
        long gcd2Timing = Duration.between(start2, finish2).toNanos();

        System.out.format("gcd of %d and %d took %d nanoseconds\n", p, q, gcdTiming);
        System.out.format("gcd2 of %d and %d took %d nanoseconds\n", p, q, gcd2Timing);
    }
}
