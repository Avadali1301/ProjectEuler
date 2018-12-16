import java.util.*;
public class Problem2 {

public static void main(String[] args) {
        int sum = 0;
        ArrayList<Integer> fibo = new ArrayList<>(100000);
        fibo.add(1);
        fibo.add(2);
        for(int i = 1; i < 10000; i++) {
                if(fibo.get(i) + fibo.get(i - 1) < 4000000) {
                        fibo.add(fibo.get(i) + fibo.get(i - 1));
                }
                else{
                        break;
                }
        }
        for(int j = 0; j < fibo.size(); j++) {
                if(fibo.get(j) % 2 == 0) {
                        sum += fibo.get(j);
                }
        }
        System.out.println(sum);
}
}
