package step12;

import java.util.Scanner;

public class Baek2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int count = 0;

		while (n % 5 != 0 && n >= 0) {
			n -= 3; 
			count++;
		}

		if (n % 5 == 0) {
			count += n / 5;
		}

		if (n < 0) {
			count = -1;
		}

		System.out.println(count);

		sc.close();
	}
}
