package step5;

import java.util.Scanner;

public class Baek1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ' ') {
				count++;
			}
		}
		if(s.charAt(0) == ' ' && s.charAt(s.length()-1) == ' ') {
			count --;
		}
		if(s.charAt(0) != ' ' && s.charAt(s.length()-1) != ' ') {
			count++;
		}
		System.out.println(count);
		sc.close();
	}

}
