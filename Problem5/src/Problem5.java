
public class Problem5 {

final static int limit = 20;

static int gcd(int x, int y) {
								while (y != 0) {
																int z = x;
																x = y;
																y = z % y;
								}
								return x;
}

public static void main(String[] args) {
								int answer = 1;
								for (int i = 1; i <= limit; i++) {
																int currentGcd = gcd(i, answer);
																answer = answer / currentGcd * i;
								}
								System.out.println(answer);
}

}
