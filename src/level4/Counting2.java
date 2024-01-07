package level4;

import java.util.ArrayList;
import java.util.Scanner;

public class Counting2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < num1; i++) {
			int num3 = sc.nextInt();
			if (num3 < num2) {
				arr.add(num3);
			}
		}
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		sc.close();
	}

}
