package step4;

import java.util.Arrays;
import java.util.Scanner;

public class MaxandMin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int[] arr = new int[num1];
		for(int i = 0; i < num1; i ++) {
			int num2 = sc.nextInt();
			arr[i] = num2;
		}
		Arrays.sort(arr);
		System.out.println(arr[0]);
		System.out.println(arr[arr.length-1]);
	
		sc.close();
	}

}
