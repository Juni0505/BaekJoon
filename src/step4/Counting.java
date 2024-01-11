package step4;

import java.util.Scanner;

public class Counting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int[] arr = new int[num1];
		int count = 0;
		
		for(int i = 0; i < num1; i ++) {
			int num2 = sc.nextInt();
			arr[i] = num2;
		}
		int num3 = sc.nextInt();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == num3) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
