package step5;

import java.util.Scanner;

public class Baek10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int[] arr = new int[26];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		
 		// 아스키 코드 알파벳 a~z 97 122
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(arr[c - 'a']== -1) {
				arr[c-'a'] = i;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}

}
