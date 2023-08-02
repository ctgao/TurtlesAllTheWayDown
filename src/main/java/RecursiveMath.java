public class RecursiveMath {
    public static int factorial(int n){
        if(n < 0){
            // BAD RESULT
            return -1;
        }
        if(n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }

    /**
     * @param x positive number!
     * @param y positive number!
     * @return greatest common divisor of x and y
     */
    public static int greatestCommonDivisor(int x, int y){
        if(x < 0 || y < 0){
            //BAD RESULT
            return -1;
        }
        if(y == 0){
            return x;
        }
        if(x >= y){
            // this is the recursive statement
            // If p > q, the gcd of p and q is the same as the gcd of q and p % q
            return greatestCommonDivisor(y, x % y);
        }
        else{
            // swapping them around to fit our recursive format
            return greatestCommonDivisor(y, x);
        }
    }
}
