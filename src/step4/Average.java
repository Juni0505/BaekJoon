package step4;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double avr = 0;
		int max = 0;
		for(int i = 0; i < n; i++) {
			int score = sc.nextInt();
			if(score > max ) {
				max = score;
			}
			avr += score;
		}
		System.out.println(avr);
		System.out.println(max);
		System.out.println(n);
		System.out.println(((avr/max)*100)/n);
		
		sc.close();
	}

}
