
public class Loops2 {

	public static void main(String[] args) {

		// a
		int i = 0;

		while (i <= 100) {
			System.out.println("Even number: " + i);
			i += 2;
		}

		// b
		int j = 100;

		while (j >= 0) {
			System.out.println(j);
			j -= 3;
		}

		// c
		for (int c = 0; c < 100; c++) {
			if (c % 2 == 1) {
				System.out.println(c);
			}

		}

		// d
		for (int d = 0; d <= 100; d++) {
			if (d % 3 == 0 && d % 5 == 0) { // added brackets here for consistency
				System.out.println("HelloWorld");
			} else if (d % 3 == 0 && d % 5 != 0) {
				System.out.println("Hello");
			} else if (d % 3 != 0 && d % 5 == 0) {
				System.out.println("World");
			} else {
				System.out.println(d);
			}

		}

	} // push whole thing into repository

}
