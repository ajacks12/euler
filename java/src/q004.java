/*
A palindromic number reads the same both ways. The largest palindrome
made from the product of two 2-digit numbers is 9009 = 91 99.
Find the largest palindrome made from the product of two 3-digit numbers
answer = 906609
 */

package src;

public final class q004 implements Euler {

    public String solve() {
        int largest = 0;
        for (int a = 999; a>99; a--){
            for (int b = 999; b>99; b--){
                int prod = a*b;
                StringBuilder str = new StringBuilder(String.valueOf(prod));
                if (str.toString().equals(str.reverse().toString())){
                    if (prod>largest){
                        largest = prod;
                    }
                }
            }
        }
        return String.valueOf(largest);
    }
}
