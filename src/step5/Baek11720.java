package step5;

import java.util.Scanner;

public class Baek11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		int sum = 0;
		for(int i = 0; i < s.length(); i++) {
			sum += Character.getNumericValue(s.charAt(i));
		}
		System.out.println(sum);
		sc.close();
	}

}
