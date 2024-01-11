package step1;

import java.util.Scanner;

public class ThreeMulti {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String num1 = sc.nextLine();
		String num2 = sc.nextLine();
		
		String s = num2.substring(2);
		String s1 = num2.substring(1,2);
		String s2 = num2.substring(0, 1);
		int a = Integer.parseInt(num1);
		int a1 = Integer.parseInt(num2);
		int b = Integer.parseInt(s);
		int c = Integer.parseInt(s1);
		int d = Integer.parseInt(s2);
		System.out.println(a*b);
		System.out.println(a*c);
		System.out.println(a*d);
		System.out.println(a*a1);
		sc.close();
	}

}
