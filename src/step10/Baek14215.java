package step10;

import java.util.Arrays;
import java.util.Scanner;

public class Baek14215 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		
		Arrays.sort(arr);
		
		while (arr[2] >= arr[0] + arr[1]) {
            arr[2]--; 
        }
		System.out.println(arr[0]+arr[1]+arr[2]);
		
		sc.close();
	}
}
