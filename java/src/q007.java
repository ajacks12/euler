/*
By listing the first six prime numbers:
2, 3, 5, 7, 11, and 13, we can see that
the 6th prime is 13.
What is the 10 001st prime number?
answer = 104743
 */

package src;

public final class q007 implements Euler {

    public String solve() {
        long testNum = 1;
        int nPrime = 0;
        while (true){
            if (isPrime(testNum)){
                nPrime++;
                if (nPrime==10001){
                    return String.valueOf(testNum);
                }
            }
            testNum++;
        }
    }

    public static boolean isPrime(long num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
