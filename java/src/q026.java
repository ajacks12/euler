/*
A unit fraction contains 1 in the numerator.
The decimal representation of the unit fractions with denominators 2 to 10 are given:

1/2	= 	0.5
1/3	= 	0.(3)
1/4	= 	0.25
1/5	= 	0.2
1/6	= 	0.1(6)
1/7	= 	0.(142857)
1/8	= 	0.125
1/9	= 	0.(1)
1/10	= 	0.1
Where 0.1(6) means 0.166666..., and has a 1-digit recurring cycle.
It can be seen that 1/7 has a 6-digit recurring cycle.

Find the value of d < 1000 for which 1/d contains the longest recurring cycle in its decimal fraction part.

answer = 983
 */

package src;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class q026 implements Euler {

    public String solve() {

        double[] fractions = new double[999];
        fractions[0] = 0;
        for (int i = 1; i < 999; i++) {
            fractions[i] = Math.floor(1 / (double) i * (double) 1e30);
        }

        List<String> list = new ArrayList<>();
        list.add("0");
        for (int i = 1; i <= 1000; i++) {
            list.add(FindDecimals(i,1000));
        }

        return "";
    }

    public static String FindLengthOfLongestRepeatedSeq(String input) {
        Pattern pattern = Pattern.compile("(.+?)(?:\\1)+");
        Matcher matcher = pattern.matcher(input);
        matcher.find();
        String matchGrp = matcher.group();
        //String repeated = input.replaceAll("(.+)(?:\\1)+","$1");

        while (true) {
            String out = FindLengthOfLongestRepeatedSeq(matchGrp);
            if (matchGrp == out) {
                return out;
            }
            matchGrp = out;
        }

    }

        public static String FindDecimals(int val, int places) {
        // 1 / 8 -> 0 r 8
        // 10/ 8 -> 1 r 2
        // 2 / 8 -> 0 r 8
        // 20/ 8 -> 2 r 4
        // 40/ 8 -> 5 r 0
        int remainder = val;
        int num = 1;
        int curPlace = 1;
        StringBuilder str = new StringBuilder();
        while (remainder != 0 & curPlace < places) {
            if (num / val == 0) num *= 10;
            str.append(num / val);
            remainder = num % val;
            num = remainder;
            curPlace++;
        }
        return str.toString();
    }
}
