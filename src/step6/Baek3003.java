package step6;

import java.util.Scanner;

public class Baek3003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,1,2,2,2,8};
		int[] arr2 = new int[6];
		for(int i = 0; i < arr2.length; i++) {
			int num = sc.nextInt();
			arr2[i] = num;
			arr[i] = arr[i] - arr2[i];
		}
		for(int i = 0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}

}
