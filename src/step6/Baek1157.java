package step6;

import java.util.Scanner;

public class Baek1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s = s.toUpperCase();
		int[] arr = new int[26];
		for (int i = 0; i < s.length(); i++) {
			int num = s.charAt(i) - 'A';
			arr[num]++;
		}
		int max = 0;
		char c = ' ';
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				c = (char) (i + 'A');
			} else if (max == arr[i]) {
				c = '?';
			}
		}
		System.out.println(c);

		sc.close();
	}
}
