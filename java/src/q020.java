/*
n! means n × (n − 1) × ... × 3 × 2 × 1

For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!

answer = 648
 */

package src;


import java.math.BigInteger;

public final class q020 implements Euler {

    public String solve() {
        BigInteger factorial = Factorial(100);
        int sumOfDigits = 0;
        String factorialStr = String.valueOf(factorial);

        for (int i = 0; i < factorialStr.length(); i++) {
            sumOfDigits += Integer.parseInt(String.valueOf(factorialStr.charAt(i)));
        }

        return String.valueOf(sumOfDigits);
    }

    private static BigInteger Factorial(int input){
        BigInteger result = new BigInteger("1");
        for (int i = 1; i <= input ; i++) {
            result = result.multiply(new BigInteger(String.valueOf(i))) ;
        }
        return result;
    }

}
