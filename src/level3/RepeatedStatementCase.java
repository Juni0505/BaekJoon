package level3;

import java.util.Scanner;

public class RepeatedStatementCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int[] arr = new int[n1];
		
		for(int i = 0; i < n1; i++) {
			int n2 = sc.nextInt();
			int n3 = sc.nextInt();
			arr[i] = n2+n3;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		sc.close();
		
		
	}

}
