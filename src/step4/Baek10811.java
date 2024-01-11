package step4;

import java.util.Scanner;

public class Baek10811 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		int num = 0;
		for(int i = 1; i <= n; i++) {
			sb.append(i);
		}
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt();
			StringBuilder subStr = new StringBuilder(sb.substring(a,b));
			subStr.reverse();
			sb.replace(a, b, subStr.toString());
		}
		
//		for(int i = 0; i < sb.length(); i++) {
//			System.out.println(sb.charAt(i));
//		}   값은 일치하나 Int값으로 내야되는듯 정답 오류
		for(int i = 0; i < sb.length(); i++) {
			num = Character.getNumericValue(sb.charAt(i));
			System.out.print(num+ " ");
		}
		sc.close();
	}

}
