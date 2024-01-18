package step6;

import java.util.Scanner;

public class Baek2941 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] strArr = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		for (int i = 0; i < strArr.length; i++) {
			if (s.contains(strArr[i])) {
				s = s.replace(strArr[i], "!");
			}
		}
		System.out.println(s.length());
		sc.close();
	}

}
