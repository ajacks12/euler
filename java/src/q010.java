/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.
answer = 142913828922
 */

package src;

public final class q010 implements Euler {

    public String solve(){
        long total = 0;
        for (long n=1;n<2000001;n++){
            if (isPrime(n)){
                total += n;
            }
        }
        return String.valueOf(total);
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
