package src;// If we list all the natural numbers below 10
// that are multiples of 3 or 5, we get 3, 5, 6 and 9.
// The sum of these multiples is 23.
// Find the sum of all the multiples of 3 or 5 below 1000.
// answer is 233168

interface euler {public String solve();}

public final class q001 implements euler {

    public static void main(String args[])  //static method
    {
        System.out.println(new q001().solve());
    }

    public String solve()
    {
        int x = 0;
        for(int i = 0;i< 1000;i++)
        {
            if (i % 3 == 0 || i % 5 == 0)
                x = x + i;
        }
        return String.valueOf(x);
    }


}