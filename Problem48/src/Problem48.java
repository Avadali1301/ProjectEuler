import java.util.*;
import java.math.BigInteger;
public class Problem48 {
public static void main(String[] args) {
        BigInteger num = new BigInteger("0");
        BigInteger temp = new BigInteger("1");
        BigInteger series = new BigInteger("0");
        for(int i = 1; i < 1001; i++) {
                series = temp.pow(i);
                temp = temp.add(BigInteger.ONE);
                num = num.add(series);

        }
        System.out.println(num);
}
}
