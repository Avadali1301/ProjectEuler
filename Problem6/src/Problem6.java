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
