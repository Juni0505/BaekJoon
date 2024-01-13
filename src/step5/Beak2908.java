package step5;

import java.util.Scanner;

public class Beak2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		sb.append(a);
		sb.reverse();
		int n1 = Integer.parseInt(sb.toString());
		sb.setLength(0);
		sb.append(b);
		sb.reverse();
		int n2 = Integer.parseInt(sb.toString());
		if(n1 > n2) {
			System.out.println(n1);
		}else {
			System.out.println(n2);
		}
		
		sc.close();
	}

}
