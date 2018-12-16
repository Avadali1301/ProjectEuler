import java.util.*;
public class Problem3 {
public static boolean isPrime(int n){
        boolean ans = true;
        for(int i = 3; i <= Math.sqrt(n); i += 2) {
                if(n % 2 == 0) {
                        ans = false;
                        break;
                }
                if(n % i == 0) {
                        ans = false;
                        break;
                }
        }
        return ans;
}
public static void main(String[] args) {
        long num = Long.parseLong("600851475143");
        int answer = 0;
        try{
                for(int j = 3; j < num; j++) {
                        if(num % j == 0 && isPrime(j) == true) {
                                if(j > answer) {
                                        answer = j;
                                }
                        }
                }
        } catch (ArithmeticException ae) {

        }
        System.out.println(answer);

}
}
