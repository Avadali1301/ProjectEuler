/*
If a box contains twenty-one coloured discs, composed of fifteen blue discs and six red discs, and two discs were taken at random, it can be seen that the probability of taking two blue discs, P(BB) = (15/21)×(14/20) = 1/2.

The next such arrangement, for which there is exactly 50% chance of taking two blue discs at random, is a box containing eighty-five blue discs and thirty-five red discs.

By finding the first arrangement to contain over 1012 = 1,000,000,000,000 discs in total, determine the number of blue discs that the box would contain.
*/
import java.math.BigInteger;
import java.lang.Math;
public class Problem100 {
private static BigInteger NI(BigInteger n, BigInteger k)
{
        final BigInteger h = n.divide(k).add(k).shiftRight(1);
        return k.equals(h)||k.equals(h.subtract(BigInteger.ONE)) ? k : NI(n, h);
}
public static BigInteger sqrt(final BigInteger num){
        if(num.signum() == -1)
                throw new ArithmeticException("Invalid Input");
        return NI(num, BigInteger.ONE);
}
public static String answer() {
        // (3, 1) is the fundamental solution
        BigInteger x0 = BigInteger.valueOf(3);
        BigInteger y0 = BigInteger.valueOf(1);
        // Creating the current solution
        BigInteger x = x0; // A variable for the number of blue discs
        BigInteger y = y0; // A variable for the number of red discs
        while (true) {
                // Check if this solution is acceptable
                BigInteger sq = sqrt(y.multiply(y).multiply(BigInteger.valueOf(8)).add(BigInteger.ONE));
                if (sq.testBit(0)) { // Is odd
                        BigInteger blue = sq.add(BigInteger.ONE).divide(BigInteger.valueOf(2)).add(y);
                        if (blue.add(y).compareTo(BigInteger.TEN.pow(12)) > 0)
                                return blue.toString();
                }

                // Create the next bigger solution
                BigInteger solx = x.multiply(x0).add(y.multiply(y0).multiply(BigInteger.valueOf(8)));
                BigInteger soly = x.multiply(y0).add(y.multiply(x0));
                x = solx;
                y = soly;
        }
}
public static void main(String[] args) {
        System.out.println(answer());
}
}
