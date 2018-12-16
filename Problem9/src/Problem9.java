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
