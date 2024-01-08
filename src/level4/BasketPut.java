package level4;

import java.util.Scanner;

public class BasketPut {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [] arr = new int[n];
		for(int l = 0 ; l < m; l++) {
			int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            for(int b = i-1; b<j; b++) {
            	arr[b] = k;
            }
		}
		for(int i = 0; i< arr.length; i ++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}

}
