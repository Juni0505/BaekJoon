package step10;

import java.util.Scanner;

public class Baek5073 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			if (a < 1 || b < 1 || c < 1) {
				break;
			}
			if (a + b <= c || b + c <= a || c + a <= b) {
				System.out.println("Invalid");
			} else {
				if (a != b && b != c && a != c) {
					System.out.println("Scalene");
				} else if (a == b && b == c) {
					System.out.println("Equilateral");
				} else {
					System.out.println("Isosceles");
				}
			}
		}
		sc.close();

	}
}
