package step9;

import java.util.Scanner;

public class Baek9506 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			if (n == -1) {
				break; 
			}

			int sum = 0;
			StringBuilder sb = new StringBuilder();

			sb.append(n).append(" = ");

			for (int i = 1; i < n; i++) {
				if (n % i == 0) {
					sum += i;
					sb.append(i).append(" + ");
				}
			}

			if (sum == n) {
				sb.setLength(sb.length() - 3);
				System.out.println(sb);
			} else {
				System.out.println(n + " is NOT perfect.");
			}
		}

		sc.close();
	}

}
