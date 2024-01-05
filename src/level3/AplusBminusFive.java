package level3;

import java.util.ArrayList;
import java.util.Scanner;

public class AplusBminusFive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a + b != 0) {
				arr.add(a + b);
			} else {
				break;
			}

		}
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}

		sc.close();
	}

}
