/*
A permutation is an ordered arrangement of objects.
For example, 3124 is one possible permutation of the digits 1, 2, 3 and 4.
If all of the permutations are listed numerically or alphabetically, we call it lexicographic order.
The lexicographic permutations of 0, 1 and 2 are:

012   021   102   120   201   210

What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?

answer = 2783915460
 */

package src;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public final class q024 implements Euler {

    public String solve() {
        List<String> numList = numList();
        return numList.get(1000000);
    }

    private List<String> numList(){
        List<String> numList = new ArrayList<>();
        BigInteger srt = new BigInteger("0123456789");
        BigInteger end = new BigInteger("9876543210");
        numList.add(srt.toString());
        for (; !srt.equals(end); srt=srt.add(BigInteger.ONE)) {
            if (HasNoRepeatedDigit(srt.toString())){
                numList.add(srt.toString());
            }
        }
        return numList;
    }

    public static boolean HasNoRepeatedDigit(String input){
        for (int i = 0; i < 9; i++) {
            if (!input.contains(String.valueOf(i))){
                return false;
            }
        }
        return true;
    }

}
