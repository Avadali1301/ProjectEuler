/*
The series, 11 + 22 + 33 + ... + 1010 = 10405071317.

Find the last ten digits of the series, 11 + 22 + 33 + ... + 10001000.
*/
import java.util.*;
import java.math.BigInteger;
public class Problem48 {
public static void main(String[] args) {
        BigInteger n = new BigInteger("0");
        BigInteger t = new BigInteger("1");
        BigInteger series = new BigInteger("0");
        for(int i = 1; i < 1001; i++) {
                series = t.pow(i);
                t = t.add(BigInteger.ONE);
                n = n.add(series);

        }
        System.out.println(n);
}
}
