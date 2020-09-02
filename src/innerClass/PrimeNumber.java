package innerClass;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Prime p = new Prime() {

			@Override
			public boolean isPrime(int a) {
				boolean fs = false;
				for (int i = 2; i < a; i++) {
					if (a % i == 0) {
						fs = false;
						break;
					} else {
						fs = true;
					}

				}
				return fs;
			}

		};
		System.out.println("Enter the Number");
		int n = s.nextInt();
		System.out.println(p.isPrime(n));

	}
}
