package level2;

import java.util.Scanner;

public class OvenClock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		int h = 0;
		
		if(n3 / 60 > 0) {
			h = n3/60;
			n2 = n2+(n3%60);
			n1 +=h;
		}else {
			n2 = n2+n3;
		}
		if(n2 >= 60) {
			n1 +=1;
			n2 -=60;
		}
		if(n1 >= 24) {
			n1 -= 24;
		}
		System.out.println(n1+" "+n2);
		sc.close();
	}

}
