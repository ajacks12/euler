/*
2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 2^1000?
answer = 1366
 */

package src;

import java.math.BigInteger;

public final class q016 implements Euler {

    public String solve(){
        BigInteger start = BigInteger.TWO.pow(1000);
        String str = start.toString();
        int total = 0;
        for (int n=0;n<str.length();n++){
            total = total + Integer.parseInt(String.valueOf(str.charAt(n)));
        }
        return String.valueOf(total);
    }




}
