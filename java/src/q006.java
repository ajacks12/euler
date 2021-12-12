/*
Find the difference between the sum
of the squares of the first one hundred
natural numbers and the square of the sum.
answer = 25164150
 */

package src;

public final class q006 implements Euler {

    public String solve() {
        double SumOfSquares = 0;
        double SquareOfSum = 0;
        double Difference = 0;
        for (double i=1;i<=100;i++){
            SumOfSquares = SumOfSquares + (Math.pow(i,2));
            SquareOfSum = SquareOfSum + i;
        }
        SquareOfSum = Math.pow(SquareOfSum,2);
        Difference = Math.abs(SquareOfSum-SumOfSquares);
        return String.format("%.0f", Difference);
    }
}
