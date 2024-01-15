package step6;

import java.util.Scanner;

public class Baek2444 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) { // ex ) num = 5 1~5까지 증가 별이 증가된값만 for반복문
			for (int j = 0; j < num - i; j++) {
				System.out.print(" "); // 공백 채우기 별이 늘어날수록 공백감소 i값이 별찍는 횟수
			}
			for (int k = 0; k < i * 2 - 1; k++) { // 해당 값이 별이 늘어나는반복문
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = num - 1; i >= 1; i--) {	// ex ) num 5 = 5부터 감소해야되니 num-1부터 감소 별이 감소된 부분부터 for 반복문
			for (int j = 0; j < num - i; j++) { // 공백칸 i값이 점차 감소됨에 따라 num - i 값으로 공백 채우기
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 - 1; j++) {	// i값이 점차 감소하므로 찍어야되는 별의 갯수 감소
				System.out.print("*");
			}
			System.out.println();
		}

		sc.close();
	}
}
