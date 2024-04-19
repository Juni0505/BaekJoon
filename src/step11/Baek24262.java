package step11;

import java.util.Arrays;
import java.util.Scanner;

public class Baek24262 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = sc.nextInt();
		
		int[] arr = new int[n];
		int max = 0;
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for (int i = n - 1; i >= 2; i--) {
            for (int j = i - 1; j >= 1; j--) {
                for (int k = j - 1; k >= 0; k--) {
                    int s = arr[i] + arr[j] + arr[k];
                    if (s <= sum && s > max) {
                        max = s;
                    }
                }
            }
        }
		System.out.println(max);
		
		sc.close();
	}

}
