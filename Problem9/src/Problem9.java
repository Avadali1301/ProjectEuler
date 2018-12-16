/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
*/
import java.util.*;
public class Problem9 {
public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;
        for(c = 5; c < 500; c++) {
                for(b = 4; b < c; b++) {
                        for(a = 3; a < b; a++) {
                                if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) && a + b + c == 1000) {
                                        System.out.println(a * b * c);
                                }
                        }
                }
        }
}
}
