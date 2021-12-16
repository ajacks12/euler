/*
Let d(n) be defined as the sum of proper divisors of
n (numbers less than n which divide evenly into n).
If d(a) = b and d(b) = a, where a ≠ b, then a and b
are an amicable pair and each of a and b are called amicable numbers.

For example, the proper divisors of 220 are
1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110;
therefore d(220) = 284.
The proper divisors of 284 are 1, 2, 4, 71 and 142;
so d(284) = 220.

Evaluate the sum of all the amicable numbers under 10000.

answer = 31626
 */

package src;

import java.util.ArrayList;
import java.util.List;

public final class q021 implements Euler {

    public String solve() {
        List<Integer> candidates = new ArrayList<>();
        candidates.add(1);
        for (int i = 1; i < 10000; i++) {
            candidates.add(SumOfProperDivisors(i));
        }
        int length = candidates.size();
        int total = 0;
        for (int i = 2; i < length; i++) {
            int curVal = candidates.get(i);
            if (curVal < length) {
                if (candidates.get(curVal) == i & curVal != i) {
                    total += curVal;
                }
            }
        }
        return String.valueOf(total);
    }

    public static int SumOfProperDivisors(int a) {
        int retVal = 1;
        for (int i = 2; i < Math.sqrt(a); i++) {
            if (a % i == 0) {
                int b = a / i;
                retVal = retVal + b + i;
            }
        }
        return retVal;
    }

}
