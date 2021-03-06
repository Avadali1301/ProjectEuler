/*
215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 21000?
*/
import java.util.*;
import java.lang.*;
import java.math.BigInteger;
public class Problem16 {
private static int calcDigits(String s)
{
        int sum = 0;

        for (int i = 0; i < s.length(); i++)
        {
                Character c = new Character(s.charAt(i));
                String z = c.toString();
                int j = Integer.parseInt(z);
                sum += j;
        }

        return sum;
}

public static void main(String[] args)
{
        long begin = System.currentTimeMillis();

        BigInteger n = BigInteger.valueOf(2);
        n = n.pow(1000);
        System.out.println(calcDigits(n.toString()));

        long end = System.currentTimeMillis();
        System.out.println(end - begin + "ms");
}
}
