package level3;

import java.util.Scanner;

public class AplusBminusSeven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		
		for(int i = 0; i < n; i ++) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			arr[i] = n1 + n2;
		}
		for(int i = 1; i <= arr.length; i++) {
			System.out.println("Case #"+ i +": " + arr[i-1]);
		}
		
		sc.close();
	}

}
