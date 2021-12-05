/*
The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?
answer = 6857
 */

package src;

public final class q003 implements Euler {

    public String solve() {
        long a = 600851475143L; // Will not fit in an integer!
        long n = 2;
        while (n < Math.sqrt(a)) {
            while (a % n == 0) {
                a = a / n;
            }
            n = n + 1;
        }
        return String.valueOf(a);
    }
}
