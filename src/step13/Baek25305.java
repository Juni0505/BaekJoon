package step13;

import java.util.Arrays;
import java.util.Scanner;

public class Baek25305 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int stuNum = sc.nextInt();
		int passNum = sc.nextInt();
		
		int[] arr = new int[stuNum];
		
		for(int i = 0; i < stuNum; i++) {
			int n = sc.nextInt();
			arr[i] = n;
		}
		Arrays.sort(arr);
		
		System.out.println(arr[stuNum-passNum]);
		
		
		sc.close();
	}

}
