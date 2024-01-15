package step6;

import java.util.Scanner;

public class Baek10988 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine(); // 알파벳 값 입력받기
		int result = 0;	// 해당 값이 팰린드롬값이 일치하면 1 아니면 0
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		sb.reverse();	// StringBuilder를 이용하여 인덱스값 뒤집기
		if(s.equals(sb.toString()) == true) { // 해당값이 일치유무에 따라 result 값 설정
			result = 1;
		}else {
			result = 0;
		}
		System.out.println(result);
		sc.close();
	}

}
