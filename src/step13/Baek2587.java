package step13;

import java.util.Arrays;
import java.util.Scanner;

public class Baek2587 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		int avr = 0;
		int sum = 0;
		
		
		for(int i = 0; i < 5; i++) {
			int n = sc.nextInt();
			arr[i] = n;
			sum += n;
		}
		Arrays.sort(arr);
		int centerNum = arr[2];
		avr = sum/5;
		
		
		System.out.println(avr);
		System.out.println(centerNum);
		
		sc.close();
	}

}
