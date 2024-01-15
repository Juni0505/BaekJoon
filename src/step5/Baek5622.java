package step5;

import java.util.Scanner;

public class Baek5622 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int time = 0;
		// 65 ~ 90 아스키 코드
		String word = sc.nextLine();
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) >= 87) {
				time += 10;
			} else if (word.charAt(i) >= 84) {
				time += 9;
			} else if (word.charAt(i) >= 80) {
				time += 8;
			} else if (word.charAt(i) >= 77) {
				time += 7;
			} else if (word.charAt(i) >= 74) {
				time += 6;
			} else if (word.charAt(i) >= 71) {
				time += 5;
			} else if (word.charAt(i) >= 68) {
				time += 4;
			} else if (word.charAt(i) >= 65) {
				time += 3;
			}
		}
		System.out.println(time);

		sc.close();

	}

}
