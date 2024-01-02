package level2;

import java.util.Scanner;

public class ChoiceFourQuadrant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if(n1 > 0) {
			if(n2 > 0) {
				System.out.println(1);
			}else {
				System.out.println(4);
			}
		}else {
			if(n2 > 0) {
				System.out.println(2);
			}else {
				System.out.println(3);
			}
		}
		sc.close();
	}

}
