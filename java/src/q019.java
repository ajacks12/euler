/*
You are given the following information, but you may prefer to do some research for yourself.

1 Jan 1900 was a Monday.
Thirty days has September,
April, June and November.
All the rest have thirty-one,
Saving February alone,
Which has twenty-eight, rain or shine.
And on leap years, twenty-nine.

A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.

How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?

answer = 171
 */

package src;

import java.util.Calendar;

public final class q019 implements Euler {

    public String solve() {
        int numSundays = 0;
        for (int curYear = 1901; curYear <= 2000; curYear++) {
            for (int curMonth = 1; curMonth <= 12; curMonth++) {
                if (IsSundayOnFirst(curYear, curMonth)) {
                    numSundays++;
                }
            }
        }
        return String.valueOf(numSundays);
    }

    private static boolean IsSundayOnFirst(int curYear, int curMonth) {
        Calendar cal = Calendar.getInstance();
        cal.set(curYear, curMonth, 1);
        return cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY;
    }

}
