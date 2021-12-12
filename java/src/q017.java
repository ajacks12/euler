/*
If the numbers 1 to 5 are written out in words: one, two, three, four, five,
then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 1000 (one thousand) inclusive were written out
in words, how many letters would be used?


NOTE: Do not count spaces or hyphens.
For example,
342 (three hundred and forty-two) contains 23 letters and
115 (one hundred and fifteen) contains 20 letters.
The use of "and" when writing out numbers is in compliance with British usage.

answer = 21124
 */

package src;

public final class q017 implements Euler {

    public String solve() {
        String finalStr = "";
        for (int n=1;n<=1000;n++){
            finalStr = finalStr + " " + NumberToString(n);
        }
        finalStr = finalStr.replace(" ","");
        return String.valueOf(finalStr.length());
    }

    public static String NumberToString(int input) {
        String outStr = "";
        if (input <= 20) {
            outStr = numberNames.valueOfLabel(input);
        } else if (input < 100) {
            int numTens = Math.floorDiv(input, 10);
            int rem = input % 10;
            String strTens = numberNames.valueOfLabel(numTens * 10);
            String strRem = numberNames.valueOfLabel(rem);
            outStr = strTens + " " + strRem;
        } else if (input < 1000) {
            int numHuns = Math.floorDiv(input, 100);
            String strHuns = numberNames.valueOfLabel(numHuns) + " HUNDRED";

            String strTens = "";
            String strOnes = "";

            if (input % 100 <= 20) {
                strOnes = numberNames.valueOfLabel(input % 100);
            } else {
                int numTens = Math.floorDiv(input % 100, 10);
                strTens = numberNames.valueOfLabel(numTens * 10);
                int numOnes = input % 10;
                strOnes = numberNames.valueOfLabel(numOnes);
            }

            if (!strTens.equals("") & !strOnes.equals("")) {
                outStr = strHuns + " AND " + strTens + " " + strOnes;
            } else if (strTens.equals("") & !strOnes.equals("")) {
                outStr = strHuns + " AND " + strOnes;
                outStr = outStr.trim();
            } else if (!strTens.equals("") & strOnes.equals("")) {
                outStr = strHuns + " AND " + strTens;
                outStr = outStr.trim();
            } else {
                outStr = strHuns;
            }
        } else if (input == 1000) {
            outStr = "ONE THOUSAND";
        } else {
            throw new IllegalArgumentException();
        }
        return outStr;
    }

    public enum numberNames {
        ONE(1),
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        ELEVEN(11),
        TWELVE(12),
        THIRTEEN(13),
        FOURTEEN(14),
        FIFTEEN(15),
        SIXTEEN(16),
        SEVENTEEN(17),
        EIGHTEEN(18),
        NINETEEN(19),
        TWENTY(20),
        THIRTY(30),
        FORTY(40),
        FIFTY(50),
        SIXTY(60),
        SEVENTY(70),
        EIGHTY(80),
        NINETY(90),
        HUNDRED(100),
        THOUSAND(1000);

        private final int numVal;

        private numberNames(int numVal) {
            this.numVal = numVal;
        }

        public int length() {
            return this.name().length();
        }

        public static String valueOfLabel(int input) {
            for (numberNames e : values()) {
                if (e.numVal == input) {
                    return e.name();
                }
            }
            return "";
        }

    }

}
