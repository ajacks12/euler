/*
There exists exactly one Pythagorean triplet for
which a + b + c = 1000.
Find the product abc.
a < b < c
answer = 31875000
 */

package src;

public final class q009 implements Euler {

    public String solve(){
        double c = 0;
        for (double b=1;b<601;b++){
            for (double a=1;a<601;a++){
                c = Math.sqrt((Math.pow(a,2)) + (Math.pow(b,2)));
                if (a + b + c == 1000){
                    return String.format("%.0f",a*b*c);
                }
            }
        }
        return "";
    }


}
