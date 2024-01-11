package step3;

import java.util.Scanner;

public class AplustBminusEight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 1; i <= n; i++) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			arr[i-1] = n1+n2;
			System.out.println("Case #"+i+": "+ n1+" + " +n2+" = "+arr[i-1]);
		}
		sc.close();
	}

}
