package step7;

import java.util.Scanner;

public class Baek10798 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] sArr = new String[5];
		StringBuilder sb = new StringBuilder();
		int max = 0;
		for(int i  = 0; i < 5; i++) {
			String s = sc.nextLine();
			sArr[i] = s;
			if(sArr[i].length() > max) {
				max = sArr[i].length();
			}
		}
		 for (int i = 0; i < 5; i++) {
	            while (sArr[i].length() < max) {
	                sArr[i] += " ";
	            }
	        }
		
		for(int i = 0; i < max; i++) {
			for(int j = 0; j < 5; j++) {
				if(sArr[j].charAt(i) != ' ') {
				sb.append(sArr[j].charAt(i));
				}
			}
		}
		System.out.println(sb);
		sc.close();
	}

}
