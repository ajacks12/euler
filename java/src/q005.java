/*
2520 is the smallest number that can be divided by each of
the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible
by all the numbers from 1 to 20?
answer = 232792560
 */

package src;

public final class q005 implements Euler {

    public String solve() {
        int retVal = 1;
        for (int i = 2; i < 20; i++) {
            retVal = LowestCommonMultiple(i,retVal);
        }
        return String.valueOf(retVal);
    }

    private static int LowestCommonMultiple(int a, int b){
        // LCM(a,b) = (a×b)/GCF(a,b)
        return (a*b)/GreatestCommonFactor(a,b);
    }

    private static int GreatestCommonFactor(int a, int b){
//        The greatest common factor GCF is the same as:
//        HCF - Highest Common Factor
//        GCD - Greatest Common Divisor
//        HCD - Highest Common Divisor
//        GCM - Greatest Common Measure
//        HCM - Highest Common Measure

        while (b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

}
