/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/
import java.util.*;
public class Problem4 {
public static boolean isPal(int n){
        boolean isDrome = true;
        String number = Integer.toString(n);
        for(int i = 0; i < number.length(); i++) {
                if(number.charAt(i) == number.charAt(number.length() - i - 1)) {

                }
                else{
                        isDrome = false;
                        break;
                }
        }
        return isDrome;
}
public static void main(String[] args) {
        int answer = 0;
        for(int j = 100; j < 1000; j++) {
                for(int k = 100; k < 1000; k++) {
                        if(isPal(k * j) == true && (k * j) > answer) {
                                answer = k * j;
                        }
                }
        }
        System.out.println(answer);
}
}
