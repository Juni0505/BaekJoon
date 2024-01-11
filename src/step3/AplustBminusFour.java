package step3;

import java.util.ArrayList;
import java.util.Scanner;

public class AplustBminusFour {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			try {
				int a = sc.nextInt();
				int b = sc.nextInt();
				arr.add(a + b);
			} catch (Exception e) {
				break;
			}
		}
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}

		sc.close();
	}

}
