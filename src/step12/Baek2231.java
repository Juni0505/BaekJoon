package step12;

import java.util.Scanner;

public class Baek2231 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min = Integer.MAX_VALUE;

		for (int i = 1; i < n; i++) {
			int sum = i;
			int temp = i;
			while (temp > 0) {
				sum += temp % 10;
				temp /= 10;
			}
			if (sum == n) {
				min = Math.min(min, i);
			}
		}

		if (min == Integer.MAX_VALUE) {
			min = 0;
		}
		System.out.println(min);
		sc.close();
	}
}
