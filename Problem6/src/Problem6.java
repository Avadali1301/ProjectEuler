/*
The sum of the squares of the first ten natural numbers is,

12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/
import java.util.*;
public class Problem6 {
public static double Sums(double n){
        if (n == 1) {
                return 1;
        }
        else{
                return Math.pow(n, 2) + Sums(n - 1);
        }
}
public static void main(String[] args) {
        double squareSums = Sums(100);
        double sumSquare = 0;
        for(int i = 1; i < 101; i++) {
                sumSquare += i;
        }
        sumSquare = Math.pow(sumSquare, 2);
        long ans = (long)(sumSquare - squareSums);
        System.out.println(ans);

}
}
