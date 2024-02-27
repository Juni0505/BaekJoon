package step8;

import java.util.Scanner;

public class Beak11005 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = sc.nextInt();
		String result = Integer.toString(num,n).toUpperCase();
		System.out.println(result);
		sc.close();
	}
}
