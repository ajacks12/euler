/*
The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:

13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.

answer = 837799
 */

package src;

public final class q014 implements Euler {

    public String solve(){
        long startValWithLongestChain = 1;
        long maxLen = 0;
        long curLen=0;
        int end = 1000000;
        for (int n = 1;n<end;n++) {
//            System.out.println("Start number: " +String.valueOf(n));
            curLen = GetCollatzSeqLength(n);
            if(curLen>maxLen) {
                maxLen = curLen;
                startValWithLongestChain = n;
//                System.out.println("New max length: "+ String.valueOf(maxLen));
            }
        }
        return String.valueOf(startValWithLongestChain);
    }

    public static long GetCollatzSeqLength(long cur){
        long next = 0;
        long length = 1;
        while (true) {
            if (cur % 2 == 0) {
                next = cur / 2;
//                System.out.println("next (was even): " +String.valueOf(next));
            } else {
                next = (3 * cur) + 1;
//                System.out.println("next (was odd): " +String.valueOf(next));
            }
            length++;
//            System.out.println("length: " +String.valueOf(length));
            if (next == 1) {
                return length;
            }
            cur = next;
        }
    }
}
