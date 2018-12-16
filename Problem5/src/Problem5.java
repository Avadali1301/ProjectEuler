/*
The series, 11 + 22 + 33 + ... + 1010 = 10405071317.

Find the last ten digits of the series, 11 + 22 + 33 + ... + 10001000.
*/
public class Problem5 {

final static int limit = 20;

static int lcm(int x, int y) {
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
		int currentlcm = lcm(i, answer);
		answer = answer / currentlcm * i;
	}
	System.out.println(answer);
}

}
