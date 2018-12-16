import java.util.*;
public class Problem7 {
public static boolean isPrime(int n){
        boolean ans = true;
        for(int i = 2; i <= Math.sqrt(n); i++) {
                if(n % i == 0) {
                        ans = false;
                        break;
                }
        }
        return ans;
}
public static void main(String[] args) {
        int counter = 0;
        int num  = 2;
        while(counter < 10001) {
                if(isPrime(num)) {
                        counter++;
                }
                if(counter == 10001) {
                        System.out.println(num);
                }
                num++;
        }

}
}
