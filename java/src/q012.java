/*
We can see that 28 is the first triangle number to have over five divisors.
What is the value of the first triangle number to have over five hundred divisors?
answer = 76576500
 */

package src;

public final class q012 implements Euler {

    public String solve(){
        int n = 12350;
        n=1;
        while (true){
            int curTri = GetTriangleNum(n);
            if (GetNumFactors(curTri)>500){
                return String.valueOf(curTri);
            }
            n++;
        }
    }

    public static int GetNumFactors(int num){
        int numFactors=0;
        int curDivisor = 1;
        while (curDivisor < Math.sqrt(num)) {
            if (num % curDivisor == 0) {
                numFactors+=2;
            }
            curDivisor++;
        }
        if (Math.sqrt(num) % 1 == 0){
            numFactors++;
        }
        return numFactors;
    }

    public static int GetNumFactorsSlow(int num){
        int numFactors=0;
        for (int n=2; n<num; n++){
            if (num % n == 0){
                numFactors++;
            }
        }
        return numFactors;
    }

    public static int GetTriangleNum(int num){
        int output = 0;
        for (int n=0;n<=num;n++){
            output +=n;
        }
        return output;
    }

}
