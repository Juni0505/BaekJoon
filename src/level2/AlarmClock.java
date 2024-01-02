package level2;

import java.util.Scanner;

public class AlarmClock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		if(n2- 45 <0) {
			n1 = n1-1;
			n2 = n2+60-45;
		}else {
			n2 = n2-45;
		}
		if(n1 < 0) {
			n1 = n1+24;
		}
		System.out.println(n1+" "+n2);
		sc.close();
	}

}
